package com.example.todo_list_api.respository;

import com.example.todo_list_api.entity.TodoListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRespository extends JpaRepository<TodoListItem, Integer> {

}
