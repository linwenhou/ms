package com.imooc.miaosha.controller;

import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.service.GoodService;
import com.imooc.miaosha.service.MiaoshaUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linwenhou
 * @date 2020-06-07 09:52
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    MiaoshaUserService userService;

    @Autowired
    GoodService goodService;


    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model, MiaoshaUser user) {

        return Result.success(user);
    }

}
