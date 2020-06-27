package com.imooc.miaosha.redis;

/**
 * @author linwenhou
 * @date 2020-05-31 16:12
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class UserKey extends BasePrefix {


    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");

}
