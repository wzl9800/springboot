package com.wzl.service.impl;

import com.wzl.service.dao.StudentDao;
import entity.Student;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import service.StudentService;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 20:09
 */
@DubboService(interfaceClass = StudentService.class,version = "1.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryById(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
