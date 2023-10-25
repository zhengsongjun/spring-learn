package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService  {
    public void setUserDao(UserDao userDao){
        System.out.println(userDao);
    }


}
