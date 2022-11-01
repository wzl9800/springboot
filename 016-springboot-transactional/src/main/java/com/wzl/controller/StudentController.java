package com.wzl.controller;

import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-13 16:54
 */
@Controller

public class StudentController {

    @Resource
    private StudentService studentService;


    @RequestMapping("/student/add")
    @ResponseBody
    public String addStudent(Integer id,String name,Integer age){
        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setAge(age);
        int sum = studentService.insertSelective(s1);
        Integer count =sum;
        return count.toString();
    }
}
