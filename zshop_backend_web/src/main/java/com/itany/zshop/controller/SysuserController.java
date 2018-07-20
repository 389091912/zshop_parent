package com.itany.zshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：汤小洋
 * Date：2018-07-20 15:55
 * Description：<描述>
 */
@Controller
@RequestMapping("/sysuser")
public class SysuserController {

    @RequestMapping("/login")
    public String login(String username,String password){
        //实现登陆

        return "main";
    }

}
