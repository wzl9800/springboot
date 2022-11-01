package com.wzl.controller;

import com.wzl.entity.School;
import com.wzl.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2021-12-14 20:07
 */
@RestController
public class MyRestController {

    @Resource
    private SchoolService schoolService;

    //学习注解的使用
    //添加学生

    @PostMapping("/school/{name}/{address}")
    public String addSchool(@PathVariable("name") String name,@PathVariable("address") String address){
        School s1 = new School();
        s1.setName(name);
        s1.setAddress(address);
        schoolService.insertSelective(s1);
        return "name="+name+"address="+address;
    }


    /*
    * 查询id=1的学生
    *@PathVariable（路径变量）：获取url中的数据
    *   属性： value ， 路径变量名
    *   位置： 放在控制器方法的形参前面
    *
    *   http://localhost:9001/myboot/school/1
    * */
    @GetMapping("/school/{schId}")
    public String querySchool(@PathVariable("schId") Integer id){
        School school = schoolService.selectByPrimaryKey(id);
        return school.toString();
    }


    /*
    * 更新数据
    * put
    * 注意spring.mvc.hiddenmethod.filter.enabled=true
    * */
    @GetMapping("/school")
    public String updateSchool( School school){
        int sum = schoolService.updateByPrimaryKeySelective(school);
        return "更新的条数"+sum;
    }
    /*public String updateSchool( Integer id,String name,String address){
        School s1 = new School();
        s1.setId(id);
        s1.setName(name);
        s1.setAddress(address);
        int sum = schoolService.updateByPrimaryKeySelective(s1);
        return "更新的条数"+sum;
    }*/


    @DeleteMapping("/delete/{stuId}")
    public String removeSchool( @PathVariable("stuId") Integer id){
        int sum = schoolService.removeByPrimaryKey(id);
        return "删除的行数"+sum;

    }
}
