package com.imooc.miaosha.redis;

/**
 * @author venvo
 * @date 2020-05-31 16:07
 * @description
 * @modified By
 * @version: jdk1.8
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();
}
