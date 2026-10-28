package com.example.demo;

import org.springframework.web.bind.bind.annotation.GetMapping;
import org.springframework.web.bind.bind.annotation.RequestParam;
import org.springframework.web.bind.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    // In-memory list to temporarily store tasks
    private final List<String> todoList = new ArrayList<>();

    // Constructor: Add some initial tasks when the server starts
    public TodoController() {
        todoList.add("Learn Spring Boot basics");
        todoList.add("Buy groceries");
    }

    // 1. View all tasks: http://localhost:8080/tasks
    @GetMapping("/tasks")
    public List<String> getTasks() {
        return todoList;
    }

    // 2. Add a new task: http://localhost:8080/tasks/add?task=Call Mom
    @GetMapping("/tasks/add")
    public String addTask(@RequestParam String task) {
        todoList.add(task);
        return "Success! '" + task + "' has been added to your to-do list.";
    }
}
