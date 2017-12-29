package com.gz.spring.boot.tomcat.https.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaozefeng
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello SpringBoot!";
    }
}
