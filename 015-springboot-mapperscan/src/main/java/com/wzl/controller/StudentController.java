package com.wzl.controller;

import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:26
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;
    @ResponseBody
    @RequestMapping("/student/query")
    public String queryId(Integer id){
       Student student =  studentService.queryId(id);
       return student.toString();
    }
}
