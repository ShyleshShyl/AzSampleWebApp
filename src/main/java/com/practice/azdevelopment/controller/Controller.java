package com.practice.azdevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}

