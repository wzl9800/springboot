package com.wzl.service.Impl;

import com.wzl.dao.SchoolDao;
import com.wzl.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-12 17:24
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private SchoolDao schoolDao;
    @Override
    public Integer cutId(Integer id) {
        Integer sum = schoolDao.deleteId(id);
        return sum;
    }
}
