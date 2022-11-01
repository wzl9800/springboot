package com.wzl.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:15
 */
//@Mapper
public interface SchoolDao {
    Integer deleteId(@Param("schId") Integer id);
}
