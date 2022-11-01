package com.wzl.service.Impl;

import com.wzl.dao.StudentMapper;
import com.wzl.entity.Student;
import com.wzl.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-13 16:49
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;


    /*
    * @Transactional:表示方法支持有事务支持
    *       默认：使用库的隔离级别，REQUIRED,传播行为，超时时间 - 1
    *       抛出运行时异常，回滚事务
    * */
    @Transactional
    @Override
    public int insertSelective(Student record) {
        //只会插入数据不为null的字段，当字段为null是会用default
        System.out.println("业务方法insertSelective");
        int sum = studentMapper.insertSelective(record);
        System.out.println("执行sql语句");

        //抛出运行时异常，目的是回滚事务
        //int m = 10 / 0;
        return sum;
    }


}
