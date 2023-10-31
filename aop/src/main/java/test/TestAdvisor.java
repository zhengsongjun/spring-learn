package test;

import org.example.dao.Service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvisor {
    @Test
    public void TestAfterAndBefore(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) applicationContext.getBean("service");
        service.beforeShow();
    }
}
