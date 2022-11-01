package com.wzl.service.Impl;

import com.wzl.dao.StudentDao;
import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:22
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryId(Integer id) {
        Student student = studentDao.selectId(id);
        return student;
    }
}
