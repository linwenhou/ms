package com.imooc.miaosha.redis;

/**
 * @author venvo
 * @date 2020-06-26 16:21
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MiaoshaKey extends BasePrefix {


    public MiaoshaKey(String prefix) {
        super(prefix);
    }

    public static MiaoshaKey isGoodsOver = new MiaoshaKey("go");
}
