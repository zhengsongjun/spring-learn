package com.annotation.factory;

import com.alibaba.druid.pool.DruidDataSource;
import com.annotation.dao.UserDao;
import com.annotation.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class MyBeanFactory {
    @Bean("dataSource")
    public DataSource dataSource () {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Dirver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean("getUserDao")
    public UserDao getUserDao(
            @Value("${jdbc.driver}") String name,
            @Qualifier("userDao") UserDao userDao
    ){
        System.out.println(name);
        userDao.show();
        return userDao;
    }

}
