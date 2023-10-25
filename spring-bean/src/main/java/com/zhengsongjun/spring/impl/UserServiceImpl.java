package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.UserService;

public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao){
        System.out.println(userDao);
    }
}
