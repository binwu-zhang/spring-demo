package com.atbinwu.service.impl;

import com.atbinwu.dao.UserDao;
import com.atbinwu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//<bean id="userService" class="com.atbinwu.service.impl.UserServiceImpl"/>
//@Component(value = "userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    //<property name="userDao" ref="userDao"/>
    //@Autowired //默认查找userDao类型注入
    //@Qualifier("userDao") //按名称查找
    @Resource(name = "userDao") //=@Autowired+@Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
