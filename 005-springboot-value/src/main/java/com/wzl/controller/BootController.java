package com.wzl.controller;

import com.wzl.vo.JxnydxTest01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangzhilong
 * @dcreate 2021-12-08 20:13
 */
@Controller
public class BootController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.servlet.context-path}")
    private String contextPath;
    @Value("${school.age}")
    private Integer age;
    @Value("${school.name}")
    private String name;
    @Value("${school.address}")
    private String address;
    @RequestMapping("/save")
    @ResponseBody
    public String doSome(){
        return name+",address="+address+",age="+age+",port="+port+",contextPath="+contextPath;
    }

    //@Resource
    @Autowired
    private JxnydxTest01 info;
    @ResponseBody
    @RequestMapping("/add")
    public String doOther(){
        return "JxnydxTest01"+",address="+info.getAddress()+",age="+info.getAge()+",name="+info.getName();
    }
}
