package org.example.service.impl;

import org.example.mapper.AccountMapper;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(outAccount,money);
        int i = 1/0;
        accountMapper.incrMoney(inAccount,money);
    }
}
