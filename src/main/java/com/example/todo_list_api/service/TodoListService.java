package com.example.todo_list_api.service;

import com.example.todo_list_api.dto.ResponseTodoList;

import java.util.List;

public interface TodoListService {
    List<ResponseTodoList> getTodoList();
}
