package com.example.Lab5_Concurrency.Non_Blocking_Approach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private final TodoClient todoClient;

    public FeignController(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    @GetMapping("/feign/todo/{id}")
    public TodoResponse getFeignTodoById(@PathVariable int id) {
        return todoClient.fetchTodoById(id);
    }
}
