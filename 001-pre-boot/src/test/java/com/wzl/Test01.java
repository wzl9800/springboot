package com.wzl;

import com.wzl.config.SpringConfig;
import com.wzl.vo.Cat;
import com.wzl.vo.Student;
import com.wzl.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangzhilong
 * @dcreate 2021-12-07 15:54
 */
public class Test01 {

//    使用配置文件
    @Test
    public void studentTest01(){
        ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) c.getBean("myStudent");
        System.out.println(student);
    }

//    使用javaconfig
    @Test
    public void studentTest02(){
        ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) c.getBean("createStudent");
        System.out.println(student);
    }

    //    使用javaconfig
    @Test
    public void studentTest03(){
        ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) c.getBean("mystudent");
        System.out.println(student);
    }

    //使用ImportResource
    @Test
    public void studentTest04(){
        ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) c.getBean("myCat");
        System.out.println(cat);
        Student student = (Student) c.getBean("myStudent");
        System.out.println(student);
    }

    //使用PropertySource
    @Test
    public void studentTest05(){
        ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) c.getBean("tiger");
        System.out.println(tiger);
    }
}
