package com.atbinwu.spring5.service;

import com.atbinwu.spring5.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
@Transactional //类和方法都可以添加
public class UserService {
    @Autowired
    private AccountDao accountDao;

    public void accountMoney(){
        accountDao.ReduceMoney();
         int i = 10/0;
        accountDao.addMoney();
    }
}
