package com.example.todo_list_api.dto;

import com.example.todo_list_api.entity.TodoListItem;

public class ResponseTodoList {
    private String id;
    private String content;
    private boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static ResponseTodoList mapResponseTodoToTodoItem(TodoListItem todoListItem) {
        ResponseTodoList responseTodo = new ResponseTodoList();
        responseTodo.setId(String.valueOf(todoListItem.getId()));
        responseTodo.setContent(todoListItem.getContent());
        responseTodo.setStatus(todoListItem.getStatus().equals("true"));
        return responseTodo;
    }

}
