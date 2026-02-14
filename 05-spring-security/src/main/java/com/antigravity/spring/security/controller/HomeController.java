package com.antigravity.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome! You have successfully authenticated.";
    }

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello from a public endpoint! No login required.";
    }
}
