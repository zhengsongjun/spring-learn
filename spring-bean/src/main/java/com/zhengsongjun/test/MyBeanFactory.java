package com.zhengsongjun.test;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.UserService;
import com.zhengsongjun.spring.impl.UserServiceImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");;
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);;

    }
}
