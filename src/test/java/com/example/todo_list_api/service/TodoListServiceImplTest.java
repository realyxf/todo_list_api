package com.example.todo_list_api.service;

import com.example.todo_list_api.entity.TodoListItem;
import com.example.todo_list_api.respository.TodoListRespository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoListServiceImplTest {
    @Mock
    private TodoListRespository todoListRespository;

    @InjectMocks
    private TodoListServiceImpl todoListService;

    @Test
    void should_retun_size_2_when_todolist_have_2_item() {
        //given
        List<TodoListItem> todoListItemList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            TodoListItem todoListItem = new TodoListItem();
            todoListItem.setId(i);
            todoListItem.setContent(i + "content");
            todoListItem.setStatus("false");
            todoListItemList.add(todoListItem);
        }
        when(todoListRespository.findAll()).thenReturn(todoListItemList);

        //when
        int result = todoListService.getTodoList().size();

        //then
        Assertions.assertEquals(2, result);
    }
}
