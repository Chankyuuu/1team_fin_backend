package com.example.todolist.controller;


import com.example.todolist.domain.TodoDTO;
import com.example.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/add-todo")
    public ResponseEntity<TodoDTO> addTodo(@RequestBody TodoDTO todoDTO){
        todoService.createTodo(todoDTO);
        return ResponseEntity.ok(todoDTO);
    }


}
