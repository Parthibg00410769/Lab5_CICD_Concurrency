package com.example.Lab5_Concurrency.Non_Blocking_Approach;

import org.springframework.stereotype.Service;

@Service
public class  FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try{
            Thread.sleep(2000);;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
}
