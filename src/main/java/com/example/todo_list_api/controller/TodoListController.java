package com.example.todo_list_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    @GetMapping("/")
    @ResponseBody
    public String test(){
        return "test";
    }
}
