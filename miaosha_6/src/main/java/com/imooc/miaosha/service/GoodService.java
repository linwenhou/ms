package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.GoodsDao;
import com.imooc.miaosha.domain.MiaoshaGoods;
import com.imooc.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author linwenhou
 * @date 2020-06-03 23:09
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Service
public class GoodService {

    @Autowired
    GoodsDao goodsDao;

    public List<GoodsVo> listGoodsVo() {
        return goodsDao.listGoodsVo();
    }

    public GoodsVo getGoodsVoByGoodsId(long goodsId) {
        return goodsDao.getGoodsVoByGoodsId(goodsId);


    }

    public boolean reduceStock(GoodsVo goods) {

        MiaoshaGoods g = new MiaoshaGoods();
        g.setGoodsId(goods.getId());
        int ret = goodsDao.reduceStock(g);//
        return ret > 0;
    }

    public void resetStock(List<GoodsVo> goodsList) {
        for(GoodsVo goods : goodsList ) {
            MiaoshaGoods g = new MiaoshaGoods();
            g.setGoodsId(goods.getId());
            g.setStockCount(goods.getStockCount());
            goodsDao.resetStock(g);
        }
    }
}
