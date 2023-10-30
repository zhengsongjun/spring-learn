package org.example.dao;

public interface UserDao {
    void show();

    void beforeShow();
    void afterRunningShow();
    void aroundShow();
    void afterShow();
    void throwingShow();
}
