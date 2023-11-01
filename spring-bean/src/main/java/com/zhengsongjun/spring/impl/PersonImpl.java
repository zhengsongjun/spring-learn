package com.zhengsongjun.spring.impl;

import com.zhengsongjun.spring.Person;
import org.springframework.beans.factory.InitializingBean;

public class PersonImpl implements Person, InitializingBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init(){

        this.setName("init setName");
        System.out.println("init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet被执行");
    }
}
