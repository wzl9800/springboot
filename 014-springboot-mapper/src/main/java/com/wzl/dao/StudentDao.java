package com.wzl.dao;

import com.wzl.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangzhilong
 * @dcreate 2021-12-11 22:33
 */
@Mapper
public interface StudentDao {
    Student queryId(@Param("stuId") Integer id );
    Integer deleteId(@Param("id") Integer id);

}
