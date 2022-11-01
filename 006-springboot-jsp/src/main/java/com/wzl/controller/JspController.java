package com.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangzhilong
 * @dcreate 2021-12-08 20:55
 */
@Controller
public class JspController {

    @RequestMapping("/myjsp")
    /*public String doJsp(HttpServletRequest request){
        request.setAttribute("data","SpringBoot使用Jsp");
        //视图逻辑名称(配置视图解析器)
        return "index";
    }*/
//和上面等价
    public String doJsp(Model model){
        model.addAttribute("data","+++SpringBoot使用Jsp+++");
        //request.setAttribute("data","SpringBoot使用Jsp");
        //视图逻辑名称(配置视图解析器)
        return "user";
    }
}
