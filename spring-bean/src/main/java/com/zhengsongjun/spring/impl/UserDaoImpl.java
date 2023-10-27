package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao, FactoryBean {

    public  UserDaoImpl () {
        System.out.println("无参构造");
    }
    public  UserDaoImpl (String name){
        System.out.println("有参构造，名称是"+name);
    }


    @Override
    public Object getObject() throws Exception {
        System.out.println("就在创建之前打印点东西吧");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
