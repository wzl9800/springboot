package com.wzl.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.Serializable;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 14:04
 */
@Data
public class Student implements Serializable {


    private static final long serialVersionUID = 4989814104139070748L;

    private Integer id;
    private String name;
    private Integer age;
}
