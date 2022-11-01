package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-10 19:14
 */
@Controller
public class BootController {

    @RequestMapping("/user/save")
    @ResponseBody
    public String doSome(){
        return "哈哈哈";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String doSome1(){
        return "哦哦哦";
    }
}
