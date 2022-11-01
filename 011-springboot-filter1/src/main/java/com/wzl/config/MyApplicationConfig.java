package com.wzl.config;

import com.wzl.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhilong
 * @dcreate 2021-12-10 22:54
 */
//注册过滤器对象
@Configuration
public class MyApplicationConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/user/*");
        return bean;
    }
}
