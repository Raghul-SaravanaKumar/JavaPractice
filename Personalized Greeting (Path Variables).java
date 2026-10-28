package com.example.demo;

import org.springframework.web.bind.bind.annotation.GetMapping;
import org.springframework.web.bind.bind.annotation.PathVariable;
import org.springframework.web.bind.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Triggers when you visit: http://localhost:8080/greet/John
    @GetMapping("/greet/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }
}
