package com.imooc.miaosha.redis;

/**
 * @author linwenhou
 * @date 2020-05-31 16:08
 * @description
 * @modified By
 * @version: jdk1.8
 */
public abstract class BasePrefix implements KeyPrefix {

    private int expireSeconds;
    private String prefix;


    public BasePrefix(String prefix) {//0代表永不过期
        this(0, prefix);
    }

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;

    }

    @Override
    public int expireSeconds() {//默认0代表永不过期

        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();

        return className + ":" + prefix;
    }
}
