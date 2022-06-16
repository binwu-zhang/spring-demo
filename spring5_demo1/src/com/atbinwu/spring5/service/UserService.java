package com.atbinwu.spring5.service;

import com.atbinwu.spring5.dao.UserDao;
import com.atbinwu.spring5.dao.UserDaoImpl;

public class UserService {


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("service add ....");

        //UserDao userDao = new UserDaoImpl();
        //userDao.update();

        userDao.update();

    }
}
