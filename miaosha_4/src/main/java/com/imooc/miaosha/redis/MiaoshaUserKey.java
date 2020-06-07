package com.imooc.miaosha.redis;

/**
 * @author venvo
 * @date 2020-05-31 22:32
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MiaoshaUserKey extends BasePrefix {

    public static final int TOKEN_EXPRIED = 3600 * 24 * 2;

    public MiaoshaUserKey(String prefix) {
        super(prefix);
    }

    public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPRIED,"tk");

    public MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
