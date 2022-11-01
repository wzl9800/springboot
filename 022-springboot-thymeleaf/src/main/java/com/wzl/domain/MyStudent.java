package com.wzl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyStudent {
    private Integer id;
    private String name;
    private Integer age;
}
