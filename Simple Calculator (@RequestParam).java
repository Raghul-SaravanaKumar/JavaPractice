package com.example.demo;

import org.springframework.web.bind.bind.annotation.GetMapping;
import org.springframework.web.bind.bind.annotation.RequestParam;
import org.springframework.web.bind.bind.annotation.RestController;

@RestController
public class CalculatorController {

    // Triggers when you visit: http://localhost:8080/add?num1=10&num2=5
    @GetMapping("/add")
    public String addNumbers(
            @RequestParam int num1, 
            @RequestParam int num2) {
        
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }
}
