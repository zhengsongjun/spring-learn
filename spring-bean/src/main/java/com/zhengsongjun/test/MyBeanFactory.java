package com.zhengsongjun.test;

import com.zhengsongjun.spring.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MyBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("beam.xml");
        Object userService = (UserService) defaultListableBeanFactory.getBean("userService");
        System.out.println(userService);
    }
}
