package org.zhengsongjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zhengsongjun.service.QuickService;

@Controller
public class QuickController {

    @Autowired
    private QuickService QuickService;
    @RequestMapping("/show")
    public String show(){
        System.out.println(QuickService);
        return "/index.html";
    }
}
