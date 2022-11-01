package com.wzl;

import com.wzl.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
/*
* ApplicationRunner和CommandLineRunner都是在容器创建好后
* 立马执行
* */
public class Application implements CommandLineRunner {

    @Resource
    private HelloService helloService;
    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        SpringApplication.run(Application.class, args);
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.hello("黑盒");
        //可以做自定义的操作，比如读取文件，数据库等等
        System.out.println("在容器对象创建好，执行的方法");
    }
}
