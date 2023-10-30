package test;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userService = (UserDao) applicationContext.getBean("userService");
        userService.show();
        userService.beforeShow();
        userService.afterRunningShow();
        userService.aroundShow();
        userService.throwingShow();
        userService.afterShow();
    }
}
