package com.imooc.miaosha.redis;

/**
 * @author linwenhou
 * @date 2020-06-10 17:20
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class GoodsKey extends BasePrefix {


    private GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");

    public static GoodsKey getMiaoshaGoodsStock = new GoodsKey(0, "gs");

}