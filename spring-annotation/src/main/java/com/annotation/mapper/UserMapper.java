package com.annotation.mapper;


import com.annotation.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserMapper {

    List<User> findAll();

}
