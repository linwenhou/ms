package com.imooc.miaosha.rabbitmq;

import com.imooc.miaosha.domain.MiaoshaUser;

/**
 * @author venvo
 * @date 2020-06-23 22:11
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MiaoshaMessage {

    private MiaoshaUser user;
    private long goodsId;

    public MiaoshaUser getUser() {
        return user;
    }

    public void setUser(MiaoshaUser user) {
        this.user = user;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
