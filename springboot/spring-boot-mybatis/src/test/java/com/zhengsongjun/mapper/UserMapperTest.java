package com.zhengsongjun.mapper;

import com.zhengsongjun.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void TestInsertUser(){
        User user = new User();
        user.setName("郑宋君");
        user.setCreatedAt("2010-10-15");
        user.setId(21);
        user.setPhone("15209894194");
        user.setEmail("644461148@qq.com");
        userMapper.insert(user);
    }

    @Test
    public void TestSelectById(){
       User user =  userMapper.selectById(21);
        System.out.println(user);
    }


    @Test
    public void TestSelectByIds(){
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        List<User> userList = userMapper.selectBatchIds(numberList);
        System.out.println(userList);
    }

    @Test
    public void TestUpdateUser(){
        User user = new User();
        user.setName("郑宋君5");
        user.setCreatedAt("2010-10-15");
        user.setId(5);
        user.setPhone("15209894194");
        user.setEmail("644461148@qq.com");
        int i = userMapper.updateById(user);
        System.out.println(i);

    }


    @Test
    public void TestDeleteById(){
        int i = userMapper.deleteById(8);
        System.out.println(i);
    }
}