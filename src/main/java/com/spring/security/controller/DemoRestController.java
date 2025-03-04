package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/getMsg")
    public String getMsg(){
        return "Good morning";
    }
    @GetMapping("/contact")
    public String contact(){
        return "9013821874";
    }
}
