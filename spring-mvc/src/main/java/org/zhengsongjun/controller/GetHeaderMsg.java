package org.zhengsongjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class GetHeaderMsg {

    @GetMapping("/cookie")
    public String  getCookie(@CookieValue(value="JSESSIONID",defaultValue = "") String jsessionid){
        System.out.println(jsessionid); //8A250FDC48021C02E019AFB9B6A12045
        return "/index.jsp";
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("Accept-Encoding") String acceptEncoding){
        System.out.println("Accept-Encoding" + acceptEncoding); // Accept-Encodinggzip, deflate, br
        return "/index.jsp";
    }


    @GetMapping("/headerAll")
    public String getHeaderAll(@RequestHeader Map<String,String> map){
        map.forEach((k,v)->{
            System.out.println(k+" : " + v);
        });
        return "/index.jsp";
    }
}
