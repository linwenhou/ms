package com.imooc.miaosha.vo;

import com.imooc.miaosha.domain.OrderInfo;

/**
 * @author venvo
 * @date 2020-06-14 10:36
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class OrderDetailVo {
    private GoodsVo goodsVo;
    private OrderInfo orderInfo;

    public GoodsVo getGoodsVo() {
        return goodsVo;
    }

    public void setGoodsVo(GoodsVo goodsVo) {
        this.goodsVo = goodsVo;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }
}
