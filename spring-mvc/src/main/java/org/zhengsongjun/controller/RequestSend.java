package org.zhengsongjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestSend {
    @GetMapping("/request1")
    public String request1(HttpServletRequest req){
        req.setAttribute("name","test");
        return "/request2";
    }


    @GetMapping("/request2")
    public String request(@RequestAttribute("name") String name){
        System.out.println(name);
        return "/index.jsp";
    };
}
