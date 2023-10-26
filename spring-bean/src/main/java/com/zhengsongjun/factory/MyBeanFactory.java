package com.zhengsongjun.factory;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.impl.UserDaoImpl;

public class MyBeanFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
