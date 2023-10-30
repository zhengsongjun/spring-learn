package org.example.dao.impl;

import org.example.dao.Service;

public class ServiceImpl implements Service {

    @Override
    public void beforeShow() {
        System.out.println("service before");
    }

}
