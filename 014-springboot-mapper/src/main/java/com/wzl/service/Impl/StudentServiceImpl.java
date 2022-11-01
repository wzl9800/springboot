package com.wzl.service.Impl;

import com.wzl.dao.StudentDao;
import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-11 22:40
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.queryId(id);
        return student;
    }

    @Override
    public Integer cutStudent(Integer id){
        Integer sum = studentDao.deleteId(id);
        return sum;
    }
}
