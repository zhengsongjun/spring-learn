package org.zhengsongjun.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class PostParam {

    @GetMapping("/getParams/{id}/{age}") // localhost:8080/getParams/1/20
    public String findById(@PathVariable("id") String id,@PathVariable("age") Integer age){
        System.out.println(id + ":" + age); //1:20
        return "/index.jsp";
    }


    @PostMapping("/fileUpload")
    public String fileUpload(@RequestBody MultipartFile myFile) throws IOException {
        InputStream inputStream = myFile.getInputStream();
        OutputStream outputStream = new FileOutputStream("/Users/promise/Desktop/server" + myFile.getOriginalFilename());
        IOUtils.copy(inputStream,outputStream);
        inputStream.close();
        outputStream.close();
        System.out.println("走到了这里");
        return "/index.jsp";
    }
}
