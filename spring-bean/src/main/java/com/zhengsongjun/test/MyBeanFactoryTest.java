package com.zhengsongjun.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactoryTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object factoryUserDao = applicationContext.getBean("factoryUserDao");
        System.out.println(factoryUserDao);
    }
}
