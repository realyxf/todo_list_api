package com.example.todo_list_api.service;

import com.example.todo_list_api.dto.ResponseTodoList;
import com.example.todo_list_api.entity.TodoListItem;
import com.example.todo_list_api.respository.TodoListRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TodoListServiceImpl implements TodoListService{

    @Autowired
    private TodoListRespository todoListRespository;

    @Override
    public List<ResponseTodoList> getTodoList() {
        List<TodoListItem> todoListItemList = todoListRespository.findAll();
        List<ResponseTodoList> responseTodoListList = new ArrayList<>();
        todoListItemList.forEach(todoListItem -> responseTodoListList.add(ResponseTodoList.mapResponseTodoToTodoItem(todoListItem)));
        return responseTodoListList;
    }
}
