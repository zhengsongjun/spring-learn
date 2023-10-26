package test;

import com.annotation.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object dataSource = applicationContext.getBean("dataSource");
        System.out.println(dataSource);
        UserDao myUserDao = (UserDao) applicationContext.getBean("getUserDao");
        myUserDao.show();
    }
}
