package com.imooc.miaosha.redis;

/**
 * @author venvo
 * @date 2020-06-27 20:55
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class AccessKey extends BasePrefix {


    public AccessKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static AccessKey access = new AccessKey(5, "access");

}