package com.atbinwu.factory;

import com.atbinwu.spring.UserDao;
import com.atbinwu.spring.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

