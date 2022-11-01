package com.wzl.service;

import com.wzl.entity.Student;

/**
 * @author wangzhilong
 * @dcreate 2021-12-11 22:38
 */

public interface StudentService {
    public Student queryStudent(Integer id);


    Integer cutStudent(Integer id);
}
