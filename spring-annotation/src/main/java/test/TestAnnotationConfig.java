package test;

import com.annotation.configuration.ApplicationConfiguration;
import com.annotation.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);

    }
}
