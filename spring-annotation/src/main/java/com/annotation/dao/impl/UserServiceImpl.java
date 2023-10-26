package com.annotation.dao.impl;

import com.annotation.dao.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("userService")
@Scope("singleton")
@Lazy(true)
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("无参构造器被执行");
    }
    @PostConstruct
    public void init(){
        System.out.println("执行init方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("执行销毁方法");
    }
}
