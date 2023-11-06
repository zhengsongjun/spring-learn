package org.zhengsongjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuickController {
    @RequestMapping("/show")
    public String show(){
        System.out.println("running");
        return "/index.html";
    }
}
