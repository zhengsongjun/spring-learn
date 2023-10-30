package com.zhengsongjun.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        BeanDefinition userDao = configurableListableBeanFactory.getBeanDefinition("userDao");
//        userDao.setBeanClassName("java.lang.String");
        //  注入对象
        BeanDefinition beanDefinition =  new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.zhengsongjun.spring.impl.PersonImpl");
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableListableBeanFactory;
        defaultListableBeanFactory.registerBeanDefinition("person",  beanDefinition);
    }
}
