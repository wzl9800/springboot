package com.wzl.config;

import com.wzl.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhilong
 * @dcreate 2021-12-10 22:03
 */
@Configuration
public class WebApplicationConfig {
    //定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/login");
//        ServletRegistrationBean bean = new ServletRegistrationBean();
//        bean.setServlet(new MyServlet());
//        bean.addUrlMappings("/login","/test");//<url-pattern
        return bean;
    }
}
