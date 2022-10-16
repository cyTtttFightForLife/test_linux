package com.example.test_linux.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Test1 {
    @GetMapping("")
    public String test(){
        System.out.println("1111");
        return "OK";
    }
}
