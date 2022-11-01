package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 19:57
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 7044167094490614536L;

    private Integer id;
    private String name;
    private Integer age;
}
