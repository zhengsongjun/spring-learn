package com.zhengsongjun.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Date;


public class TimeLogPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(i-> System.out.println(i.getName()));
        return  Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("方法："+method.getName()+"-开始时间" + new Date());
                    Object result = method.invoke(bean,args);
                    System.out.println("方法："+method.getName()+"-结束时间" + new Date());
                    return result;
                }

        );
    }
}
