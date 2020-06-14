package com.imooc.miaosha.domain;

/**
 * @author linwenhou
 * @date 2020-06-03 23:06
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MiaoshaOrder {
    private Long id;
    private Long userId;

    private Long orderId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    private Long goodsId;


}
