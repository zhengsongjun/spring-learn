package org.example.service.impl;

import org.example.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceImplTest {
    @Test
    public void TestAccountServiceTransferMoney(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = (AccountService) applicationContext.getBean("accountService");
        service.transferMoney("tom","jerry",500);

    }
}