package com.annotation.dao.impl;

import com.annotation.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("我是userDao1");
    }
}
