package com.zhengsongjun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPorcessor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object userDao = classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
