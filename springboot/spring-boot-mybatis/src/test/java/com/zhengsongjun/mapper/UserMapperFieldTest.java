package com.zhengsongjun.mapper;

import com.zhengsongjun.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UserMapperFieldTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestSelectAllMySelf(){
        List<User> userList = userMapper.selectAllMySelf();
        System.out.println(userList);
    }

    @Test
    public void TestInsertNewUser(){
        User user = new User();
        user.setCreatedAt("20121211222");
        user.setName("123");
        user.setPhone("20121211222");
        user.setUpdateTime(String.valueOf(LocalDateTime.now()));
        user.setCreatedAt(String.valueOf(LocalDateTime.now()));
        userMapper.insert(user);
    }

    @Test
    public void TestSelectById(){
       User user =  userMapper.selectById(1);
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

}