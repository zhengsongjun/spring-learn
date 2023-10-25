package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService  {
    private String name;

    private UserDao userDao;
    public UserServiceImpl(String name) {
        this.name = name;
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


}
