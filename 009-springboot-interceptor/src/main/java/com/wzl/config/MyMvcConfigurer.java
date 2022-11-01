package com.wzl.config;

import com.wzl.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangzhilong
 * @dcreate 2021-12-10 18:33
 */
//注册拦截器
@Configuration
public class MyMvcConfigurer implements WebMvcConfigurer {
    HandlerInterceptor handler = new LoginInterceptor();
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //要拦截的地址
        String path []= {"/user/**"};
        //不用拦截的地址
        String excludePath [] = {"/user/login"};
        registry.addInterceptor(handler).
                excludePathPatterns(excludePath).
                addPathPatterns(path);
    }
}
