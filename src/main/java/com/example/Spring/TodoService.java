package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public void printTodos() {
        System.out.println(todoRepository.getAllTodos());
    }
}
