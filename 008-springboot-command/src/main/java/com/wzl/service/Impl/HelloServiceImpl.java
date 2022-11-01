package com.wzl.service.Impl;

import com.wzl.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author wangzhilong
 * @dcreate 2021-12-09 18:34
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public void hello(String name) {
        System.out.println("你好，"+name);
    }
}
