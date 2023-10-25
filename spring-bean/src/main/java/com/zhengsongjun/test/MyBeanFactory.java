package com.zhengsongjun.test;

import com.zhengsongjun.spring.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext applicationContext = applicationContext1;
        Object userService = applicationContext.getBean("userService");
        System.out.println(userService);
    }
}
