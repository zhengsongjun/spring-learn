package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.UserDao;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao  {

    public  UserDaoImpl () {
        System.out.println("无参构造");
    }
    public  UserDaoImpl (String name){
        System.out.println("有参构造，名称是"+name);
    }



}
