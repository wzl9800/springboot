package com.wzl.filter;

import javax.servlet.*;
import java.io.IOException;


/**
 * @author wangzhilong
 * @dcreate 2021-12-10 22:45
 */
//自定义的过滤器类
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了MyFilter，doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
