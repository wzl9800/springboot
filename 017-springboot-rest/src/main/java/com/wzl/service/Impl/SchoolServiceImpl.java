package com.wzl.service.Impl;

import com.wzl.dao.SchoolMapper;
import com.wzl.entity.School;
import com.wzl.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-14 20:49
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private SchoolMapper schoolMapper;
    @Override
    public int insertSelective(School school) {
        int sum = schoolMapper.insertSelective(school);
        return sum;
    }

    @Override
    public School selectByPrimaryKey(Integer id) {
        School school = schoolMapper.selectByPrimaryKey(id);
        return school;
    }

    @Override
    public int updateByPrimaryKey(School record) {
        int sum = schoolMapper.updateByPrimaryKey(record);
        return sum;
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        int sum = schoolMapper.updateByPrimaryKeySelective(record);
        return sum;
    }

    @Override
    public int removeByPrimaryKey(Integer id) {
        int sum = schoolMapper.deleteByPrimaryKey(id);
        return sum;
    }

}
