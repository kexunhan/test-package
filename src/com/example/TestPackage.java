package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping
@RestController
public class TestPackage {

    public static void main(String[] args) {
        SpringApplication.run(TestPackage.class, args);
    }
    @GetMapping("/hello")
    public String test(){
        return "hello word";
    }



}
