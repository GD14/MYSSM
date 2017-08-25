package com.rong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wh on 2017/8/25.
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String getUser(){

        return "hell";
    }
    @RequestMapping("/userList")
    public String getUserList(){

        return "hello";
    }
}
