package com.wzl.controller;

import com.wzl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2022-02-24 21:59
 */
@RestController
@RequestMapping("/redis")
public class redisController {

    @Resource
    private RedisTemplate redisTemplate;

    @PostMapping("/add/{key}/{value}")
    public String redisAddString(@PathVariable String key, @PathVariable String value){
        redisTemplate.opsForValue().set(key,value);
        return "添加数据成功！！！";
    }

    @GetMapping("/get/{key}")
    public String redisGetKey(@PathVariable String key){
        Object value = redisTemplate.opsForValue().get(key);
        return "根据"+key+"获得value的值为:"+value;
    }


    @Autowired
    private StringRedisTemplate  stringRedisTemplate;
    @PostMapping("/save/{k}/{v}")
    public String redisSave(@PathVariable String k,@PathVariable String v){
        stringRedisTemplate.opsForValue().set(k,v);
        return "添加数据成功";
    }

    @GetMapping("/select/{k}")
    public String redisSelect(@PathVariable String k){
        String v = stringRedisTemplate.opsForValue().get(k);
        return "v:"+v;
    }


    /*设置key和value序列化*/
    @PostMapping("/insert")
    public String insertSet(String a,String b){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(a,b);
        return "添加数据成功！！！";
    }

    @PostMapping("/get")
    public String getSet(String a){
        Object o = redisTemplate.opsForValue().get(a);
        return "获取的数据是："+o;
    }

    /*json序列化*/

    @PostMapping("/addJson")
    public String addJson(String key){
        Student student = new Student();
        student.setId(1001);
        student.setName("李四");
        student.setAge(20);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set(key,student);
        return "添加json数据成功！！！";
    }

    @GetMapping("/getJson")
    public String getJson(String key){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Object o = redisTemplate.opsForValue().get(key);
        return "获取的json数据为："+ o;
    }
}
