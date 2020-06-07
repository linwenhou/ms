package com.imooc.miaosha.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author venvo
 * @date 2020-05-31 17:48
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class MD5Util {


    private static final String salt = "1a2b3c4d";

    public static String md5(String src) {

        return DigestUtils.md5Hex(src);
    }

    public static String inputPassFormPass(String inputPass) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);

    }

    public static String formPasstoDBPass(String formPass, String salt) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);

    }

    public static String inputPassToDbPass(String input, String saltDB) {
        String formPass = inputPassFormPass(input);
        String dbPass = formPasstoDBPass(formPass, saltDB);
        return dbPass;

    }

    public static void main(String[] args) {
        System.out.println(inputPassFormPass("123456"));//d3b1294a61a07da9b49b6e22b2cbd7f9
//        System.out.println(formPasstoDBPass(inputPassFormPass("123456"), "1a2b3c4d"));
//        System.out.println(inputPassToDbPass("123456","1a2b3c4d"));
    }
}
