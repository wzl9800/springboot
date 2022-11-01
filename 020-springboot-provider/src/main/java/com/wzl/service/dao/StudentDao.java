package com.wzl.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 20:26
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
