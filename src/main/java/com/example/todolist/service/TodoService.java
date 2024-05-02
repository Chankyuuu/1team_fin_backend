package com.example.todolist.service;

import com.example.todolist.domain.Todo;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.repository.TodoRepository;

public class TodoService {
    private final TodoRepository todoRepository;

    @Override
    public void createTodo(TodoDTO params) {
        Todo facility = TodoDTO.toEntity(params);
        TodoRepository.save(facility);
        log.info("facility saved : {}", facility);
    }
}
