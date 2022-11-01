package com.wzl.controller;

import entity.Student;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 20:59
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @DubboReference(interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @GetMapping("/query/{id}")
    public String selectById(@PathVariable Integer id){
        Student student = studentService.queryById(id);
        return "返回查询的数据："+student;
    }
}
