package com.wzl.config;

import com.wzl.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhilong
 * @dcreate 2021-12-11 22:13
 */
//注册Servlet
@Configuration
public class WebApplicationConfig  {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/user/query");
        return bean;
    }
}
