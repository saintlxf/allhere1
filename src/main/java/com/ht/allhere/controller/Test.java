package com.ht.allhere.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/test")
public class Test {
    @RequestMapping("/tr")
    public void req(){
        System.out.println("aaaaa");
    }
}
