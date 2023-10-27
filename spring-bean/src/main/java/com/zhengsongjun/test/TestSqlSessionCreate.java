package com.zhengsongjun.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class TestSqlSessionCreate {
    public static void main(String[] args) throws IOException {
        // 静态工厂方式
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object sqlSessionFactory = classPathXmlApplicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
    }
}
