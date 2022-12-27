package com.example.googlTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class usercontrol {

    @GetMapping
    public String toTest() {
        return "Welcome to Java Spring boot...";
    }

    //get data by id
    @GetMapping("product")
    public String getById() {
        return "hello";

    }
}