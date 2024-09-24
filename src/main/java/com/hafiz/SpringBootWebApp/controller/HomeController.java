package com.hafiz.SpringBootWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to Adam Sports";
    }

    @RequestMapping("/contact")
    public String contact() {
        return  "Please contact at adamsports@email.com";
    }

}
