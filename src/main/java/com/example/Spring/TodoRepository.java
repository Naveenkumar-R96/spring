package com.example.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    String getAllTodos(){
        return "todo";
    }
}
