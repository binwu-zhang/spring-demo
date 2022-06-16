package com.atbinwu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void add(){
        System.out.println("dao add....");
    }
}
