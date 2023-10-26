package com.annotation.dao.impl;

import com.annotation.dao.UserDao;
import com.annotation.mapper.UserMapper;
import com.annotation.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void show() {
        System.out.println("我是userDao1");
    }


    public void showAll(){
        List<User> all = userMapper.findAll();
        all.stream().forEach(user -> System.out.println(user));
    }
}
