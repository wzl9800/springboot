package com.wzl.dao;

import com.wzl.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:14
 */
//@Mapper
public interface StudentDao {
    Student selectId(@Param("stuId") Integer id);
}
