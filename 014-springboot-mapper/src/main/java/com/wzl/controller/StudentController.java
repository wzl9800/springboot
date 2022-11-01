package com.wzl.controller;

import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-11 22:43
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/query/{id}")
    @ResponseBody
    public String studentquery(@PathVariable Integer id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }

    @RequestMapping("/cut")
    @ResponseBody
    public String cutStudent(Integer id){
        Integer sum = studentService.cutStudent(id);
        return sum.toString();
    }
}
