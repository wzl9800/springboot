package com.wzl.service.Impl;

import com.wzl.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wangzhilong
 * @dcreate 2021-12-09 18:18
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println(("执行了业务方法的sayHello" + name));
    }
}
