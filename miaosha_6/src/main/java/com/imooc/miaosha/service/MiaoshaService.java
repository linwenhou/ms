package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.GoodsDao;
import com.imooc.miaosha.domain.Goods;
import com.imooc.miaosha.domain.MiaoshaOrder;
import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.OrderInfo;
import com.imooc.miaosha.redis.MiaoshaKey;
import com.imooc.miaosha.redis.RedisService;
import com.imooc.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author linwenhou
 * @date 2020-06-06 12:10
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Service
public class MiaoshaService {


    @Autowired
    GoodService goodService;

    @Autowired
    OrderService orderService;

    @Autowired
    RedisService redisService;

    @Transactional
    public OrderInfo miaosha(MiaoshaUser user, GoodsVo goods) {

        //减库存 下订单  写入秒杀订单
        boolean success = goodService.reduceStock(goods);
        if (success) {
            //order_info miaosha_order
            return orderService.createOrder(user, goods);
        } else {

            setGoodsOver(goods.getId());
            return null;
        }

    }

    public long getMiaoshaResult(Long userId, long goodsId) {

        MiaoshaOrder order = orderService.getMiaoshaOrderByUserIdGoodsId(userId, goodsId);

        if (order != null) {
            //秒杀成功
            return order.getOrderId();
        } else {
            boolean isOver = getGoodsOver(goodsId);
            if (isOver) {
                return -1;
            } else {
                return 0;
            }
        }
    }


    private void setGoodsOver(long goodsId) {
        redisService.set(MiaoshaKey.isGoodsOver, "" + goodsId, true);

    }

    private boolean getGoodsOver(long goodsId) {

        return redisService.exist(MiaoshaKey.isGoodsOver, "" + goodsId);

    }

    public void reset(List<GoodsVo> goodsVoList) {

        goodService.resetStock(goodsVoList);
        orderService.deleteOrders();
    }
}
