package com.example.Lab5_Concurrency.Non_Blocking_Approach;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos/{id}")
    TodoResponse fetchTodoById(@PathVariable("id") int id);

    TodoResponse fetchData();
}
