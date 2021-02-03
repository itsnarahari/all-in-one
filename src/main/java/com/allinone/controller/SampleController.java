package com.allinone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    @Value("${ex}")
    String v;

    @Autowired
    ApplicationContext context;

    @GetMapping("/")
    public String hello(){
        return "Server Startup date "+context.getStartupDate();
    }
}
