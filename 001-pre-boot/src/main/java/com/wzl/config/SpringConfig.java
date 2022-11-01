package com.wzl.config;

import com.wzl.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @author wangzhilong
 * @dcreate 2021-12-07 15:57
 */
//@ImportResource(value = "classpath:applicationContext.xml")
@ImportResource(value = {"classpath:applicationContext.xml","classpath:bean.xml"})//指定多个配置文件
/*
* Configuratiion:表示当前类是作为配置文件使用的。就是用来配置容器的
* 位置：类的上面
*
* SpringConfig这个类就相当于bean.xml
* */
@Configuration
//读取属性配置文件
@PropertySource("classpath:config.properties")
//组件扫描器的注解
@ComponentScan(value = "com.wzl.vo")
public class SpringConfig {
    /*
    * 创建方法：方法返回值是对象，在方法的上面加入@Bean
    * 方法的返回值对象就注入到容器中
    *
    * @Bean: 把对象注入到spring容器中，作用相当于<bean></bean>
    *       位置：方法上面
    *       说明：@Bean，不指定对象的名称，默认是方法名是 id
    * */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("王志龙");
        s1.setAge(23);
        s1.setSex(true);
        return s1;
    }


    /*
    * 指定对象在容器中的名称（指定<bean></bean>的id属性）
    * @Bean(name = "对象的名称")
    * */
    @Bean(name = "mystudent")
    public Student makeStudent(){
        Student s1 = new Student();
        s1.setName("张飞");
        s1.setAge(23);
        s1.setSex(true);
        return s1;
    }
}
