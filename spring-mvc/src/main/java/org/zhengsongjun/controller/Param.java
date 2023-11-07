package org.zhengsongjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zhengsongjun.pojo.User;

import java.util.List;

@Controller
public class Param {


    @GetMapping("params5") //http://localhost:8080/params5?name=zsj&age=20&clazz=班&address.city=北&address.number=100
    public String getParamToUser(User user){
        System.out.println(user);
        return "/index.jsp";
    }

    @GetMapping("params4") //http://localhost:8080/params4?howdy=zq&howdy=wq&howdy=ss
    public String getParamToList(List<String> howdy){
        for (String s : howdy) {
            System.out.println(s);  // zq wq ss
        }
        return "/index.jsp";
    }

    @GetMapping("params3") //http://localhost:8080/params3?howdy=zq&howdy=wq&howdy=ss
    public String getParamToArray(String[] howdy){
        for (String s : howdy) {
            System.out.println(s);  // zq wq ss
        }
        return "/index.jsp";
    }

    @GetMapping("params1") //http://localhost:8080/params1?username=zsj&age=20
    public String getParamToAlise(@RequestParam("username") String name, Integer age){
        System.out.println(name + " : " + age); //zsj : 20
        return "/index.jsp";
    }

    @GetMapping("params") // /params?username=zsj
    public String getParamBase(String username,Integer age){
        System.out.println(username);
        return "/index.jsp";
    }

}
