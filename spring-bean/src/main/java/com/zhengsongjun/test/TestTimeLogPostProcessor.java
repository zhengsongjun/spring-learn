package com.zhengsongjun.test;

import com.zhengsongjun.spring.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTimeLogPostProcessor {
    @Test
    public void TestTimeLogPostProcessor(){
        System.out.println("timelog");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.hello();
    }
}
