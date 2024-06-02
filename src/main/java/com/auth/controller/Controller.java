package com.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public @RestController class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/hello-secured")
    public String helloSecured(){
        return "Hello World Secured!";
    }
}
