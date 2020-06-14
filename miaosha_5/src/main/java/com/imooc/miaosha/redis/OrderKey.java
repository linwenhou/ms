package com.imooc.miaosha.redis;

/**
 * @author linwenhou
 * @date 2020-05-31 16:13
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class OrderKey extends BasePrefix {
    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
