package org.example.dao.impl;

import org.example.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("userDao show...");
    }

    @Override
    public void beforeShow() {
        System.out.println("user前置通知");
    }

    @Override
    public void afterRunningShow() {
        System.out.println("user后置通知");
    }

    @Override
    public void aroundShow() {
        System.out.println("user环绕通知");
    }

    @Override
    public void afterShow() {
        System.out.println("user最后通知");
    }

    @Override
    public void throwingShow() {
        System.out.println("user错误通知");
    }


}
