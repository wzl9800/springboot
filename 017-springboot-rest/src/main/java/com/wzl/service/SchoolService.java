package com.wzl.service;

import com.wzl.entity.School;

/**
 * @author wangzhilong
 * @dcreate 2021-12-14 20:48
 */
public interface SchoolService {
    int insertSelective(School school);

    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(School record);

    int updateByPrimaryKeySelective(School record);

    int removeByPrimaryKey(Integer id);
}
