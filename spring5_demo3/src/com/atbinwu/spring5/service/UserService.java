package com.atbinwu.spring5.service;


import com.atbinwu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//注解value可以省略，默认类名称首字母小写 UserService=>userService
@Service
//@Controller
//@Repository
//@Component(value = "userService") //<bean id="userService" class""/>
public class UserService {

    //添加注入属性注解
    //@Autowired 根据属性类型注入
    /*@Autowired
    private UserDao userDao;*/

    //@Qualifier 根据属性名称注入，和@Autowired一起使用
   /* @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;*/

    //@Resource 根据属性/类型注入
    //@resource 根据属性类型注入
    //@Resource(name = "userDaoImpl") 根据属性名称注入
    @Resource
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("service add...");
        userDao.add();
        System.out.println(name);
    }
}
