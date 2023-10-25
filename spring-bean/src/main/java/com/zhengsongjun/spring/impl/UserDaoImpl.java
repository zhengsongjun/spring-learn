package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao , InitializingBean {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl 被创建");
    }

    public void init(){
        System.out.println("UserDaoImpl init");
    }

    public void destroy(){
        System.out.println("UserDaoImpl destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("接口实现的创建");
    }
}
