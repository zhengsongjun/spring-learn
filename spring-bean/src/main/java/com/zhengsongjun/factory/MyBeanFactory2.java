package com.zhengsongjun.factory;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.impl.UserDaoImpl;

public class MyBeanFactory2 {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
