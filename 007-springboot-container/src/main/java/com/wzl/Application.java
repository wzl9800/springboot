package com.wzl;

import com.wzl.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext act = SpringApplication.run(Application.class, args);
        UserService userService = (UserService) act.getBean("userService");
        userService.sayHello("汤姆猫");
    }

}
