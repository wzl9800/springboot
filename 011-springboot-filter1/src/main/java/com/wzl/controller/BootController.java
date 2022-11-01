package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-10 23:09
 */
@Controller
public class BootController {
    @ResponseBody
    @RequestMapping("/user/add")
    public String doSome(){
        return "中国哈哈哈servlet";
    }

    @ResponseBody
    @RequestMapping("/query")
    public String doSome1(){
        return "好好好";
    }
}
