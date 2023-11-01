package com.zhengsongjun.process;

import com.zhengsongjun.spring.impl.PersonImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        if(bean instanceof PersonImpl){
            ((PersonImpl) bean).setName("beanProcessBeforeSetName");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postPorcessAfterInitialization");
        return bean;
    }
}
