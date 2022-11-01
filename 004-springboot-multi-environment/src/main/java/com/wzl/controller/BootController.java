package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-08 17:17
 */
@Controller
public class BootController {

    @ResponseBody
    @RequestMapping("/hello")
    public String doSome(){
        return "SpringBoot多环境配置";
    }
}
