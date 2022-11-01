package com.wzl.controller;

import com.wzl.service.SchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:28
 */
@Controller
public class SchoolController {

    @Resource
    private SchoolService schoolService;
    @RequestMapping("/school/cut")
    @ResponseBody
    public String cutId(Integer id){
        Integer sum = schoolService.cutId(id);
        return sum.toString();
    }
}
