package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.GoodsDao;
import com.imooc.miaosha.domain.Goods;
import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.OrderInfo;
import com.imooc.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public OrderInfo miaosha(MiaoshaUser user, GoodsVo goods) {

        //减库存 下订单  写入秒杀订单
        goodService.reduceStock(goods);
        //order_info miaosha_order
        return orderService.createOrder(user, goods);

    }
}
