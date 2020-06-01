package com.imooc.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.imooc.miaosha.result.CodeMsg.SUCCESS;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
}
