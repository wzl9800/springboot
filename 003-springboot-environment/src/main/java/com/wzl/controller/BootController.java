package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-08 15:41
 */
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "lisi hello world!!! ";
    }
}
