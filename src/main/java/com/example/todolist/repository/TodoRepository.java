package com.example.todolist.repository;

import com.example.todolist.domain.Todo;
import com.example.todolist.domain.TodoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {{

}
