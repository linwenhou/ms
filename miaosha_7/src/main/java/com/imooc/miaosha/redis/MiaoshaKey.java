package com.imooc.miaosha.redis;

/**
 * @author venvo
 * @date 2020-06-26 16:21
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MiaoshaKey extends BasePrefix {


    public MiaoshaKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static MiaoshaKey isGoodsOver = new MiaoshaKey(0, "go");
    public static MiaoshaKey getMiaoshaPath = new MiaoshaKey(60, "mp");
    public static MiaoshaKey getMiaoshaVerifyCode = new MiaoshaKey(300, "vc");

}
