package com.zhengsongjun.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhengsongjun.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperQueryWrapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        // 查询超过500，
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>()
                .select("id","username","balance","name")
                .like("name","o")
                .ge("balance",5000);
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    public void testQueryWrapperUpdate(){
        //1.跟新的数据

        userMapper.update(user,wrapper)
    }

}
