package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-08 12:49
 */
@Controller
public class springbootmvc {
    @ResponseBody
    @RequestMapping("/hello")
    public String hellomethod(){
        return "嗨咯，李岩璞！！！";
    }
}
