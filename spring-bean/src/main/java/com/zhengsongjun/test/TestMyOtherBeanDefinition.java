package com.zhengsongjun.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyOtherBeanDefinition {

    @Test
    public void TestMyOtherBeanDefinitionRegister() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
    }
}
