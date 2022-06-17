package com.atbinwu.spring.impl;

import com.atbinwu.domain.User;
import com.atbinwu.spring.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<String> userList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }

    public void save(){
        System.out.println(username+age);
        System.out.println(userList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");
    }
}
