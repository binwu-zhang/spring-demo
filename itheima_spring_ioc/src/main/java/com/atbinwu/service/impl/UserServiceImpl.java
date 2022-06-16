package com.atbinwu.service.impl;

import com.atbinwu.service.UserService;
import com.atbinwu.spring.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void save() {
        userDao.save();
    }
}
