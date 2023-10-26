package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userServiceImpl = applicationContext.getBean("userService");
    }
}
