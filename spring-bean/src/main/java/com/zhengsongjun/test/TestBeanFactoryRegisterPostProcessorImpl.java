package com.zhengsongjun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactoryRegisterPostProcessorImpl {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
    }
}
