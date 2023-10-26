package test;

import com.annotation.configuration.ApplicationConfiguration;
import com.annotation.dao.UserDao;
import com.annotation.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDao");
        userDao.showAll();

    }
}
