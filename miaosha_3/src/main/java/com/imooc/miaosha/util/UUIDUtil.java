package com.imooc.miaosha.util;

import java.util.UUID;

/**
 * @author linwenhou
 * @date 2020-05-31 22:30
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class UUIDUtil {

    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
