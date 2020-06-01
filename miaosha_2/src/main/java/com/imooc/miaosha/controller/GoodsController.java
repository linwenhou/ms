package com.imooc.miaosha.controller;

import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.User;
import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.service.MiaoshaUserService;
import com.imooc.miaosha.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author venvo
 * @date 2020-05-31 18:05
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static Logger log = LoggerFactory.getLogger(GoodsController.class);
    @Autowired
    MiaoshaUserService userService;

    @RequestMapping("/to_list")
    public String toLogin(Model model, @CookieValue(value = MiaoshaUserService.COOKIE_NAME_TOKEN, required = false) String cookieToken,
                          @RequestParam(value = MiaoshaUserService.COOKIE_NAME_TOKEN, required = false) String paramToken) {

        if (StringUtils.isEmpty(cookieToken) && StringUtils.isEmpty(paramToken)) {
            return "login";
        }
       String token = StringUtils.isEmpty(paramToken) ? cookieToken : paramToken;
        MiaoshaUser user =userService.getByToken(token);
        model.addAttribute("user",user);

        return "goods_list";
    }

}
