package com.wzl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangzhilong
 * @dcreate 2022-02-25 14:25
 */
@RestController
@RequestMapping("/re")
public class Controller {
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/save/{key}/{value}")
    public String addString(@PathVariable String key,@PathVariable String value){
        redisTemplate.opsForValue().set(key,value);
        return "添加数据成功！";
    }

    @GetMapping("/gets/{key}")
    public String getString(@PathVariable String key){
        Object o = redisTemplate.opsForValue().get(key);
        return "获取的数据为：" + o;
    }
}
