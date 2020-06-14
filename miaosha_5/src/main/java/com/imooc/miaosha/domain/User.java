package com.imooc.miaosha.domain;

/**
 * @author linwenhou
 * @date 2020-05-31 11:16
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class User {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
