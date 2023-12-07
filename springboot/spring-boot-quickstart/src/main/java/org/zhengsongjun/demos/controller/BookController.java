package org.zhengsongjun.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zhengsongjun.demos.dto.Book;


//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getById(){
        System.out.println("请求到达成功！");
        return "spring book running";
    }

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("book save！");
        return "spring book save";
    }

//    @GetMapping
//    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id){
        System.out.println("删除book id是 "+ id);
        return "spring book deleteid";
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book books){
        System.out.println("修改成功！" + books);
        return "spring book update";
    }
}
