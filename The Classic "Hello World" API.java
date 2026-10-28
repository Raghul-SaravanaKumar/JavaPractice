package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Access this at: http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to Spring Boot!";
    }
}
