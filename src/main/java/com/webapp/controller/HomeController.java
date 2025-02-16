package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
     return "Hello world";
    }
    @GetMapping("/")
    public String getRoo(){
        return "This is web api application";
    }
}
