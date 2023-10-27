package com.zhengsongjun.test;

import com.zhengsongjun.spring.UserDao;
import com.zhengsongjun.spring.UserService;
import com.zhengsongjun.spring.impl.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactory {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");;
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

    }
}
