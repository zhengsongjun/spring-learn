package com.annotation.dao.impl;

import com.annotation.dao.UserDao;
import com.annotation.dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("userService")
@Scope("singleton")
@Lazy(true)
public class UserServiceImpl implements UserService {
   @Autowired
   @Qualifier
   private UserDao userDao;

   @Resource(name="userDao")
   public void xxx(){

   }
}
