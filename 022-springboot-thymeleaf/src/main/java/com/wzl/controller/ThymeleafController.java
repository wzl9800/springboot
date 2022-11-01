package com.wzl.controller;

import com.wzl.domain.MyStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.View;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 10:58
 */
@Controller
@RequestMapping("/thy")
public class ThymeleafController {

    @PostMapping("/add")
    public String thymeleaf(Model model){
        model.addAttribute("data","thymeleaf模板中的数据！");
        return "main";
    }

    @GetMapping("/student")
    public String mystudent(Model model){
        model.addAttribute("hh","http://www.baidu.com");
        model.addAttribute("student",new MyStudent(1001,"李四",23));
        return "mystudent";
    }

}
