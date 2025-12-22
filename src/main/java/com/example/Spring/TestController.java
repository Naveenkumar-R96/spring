package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todo")
public class TestController {
    @GetMapping("/check")
    String getTodo() {
        return "Todo";
    }

    @GetMapping("/api")
    String getTodoApi() {
        return "api";
    }

    //PathVariable
    @GetMapping("/{idd}")
    String getTodoId(@PathVariable int idd) {
        return " " + idd;
    }

    @GetMapping("")
    long getTodoByIdParam(@RequestParam("todoId") long id) {
        return id;
    }

    @GetMapping("/create")
    String createUser(@RequestParam String userId, @RequestParam String password) {
        return " " + userId + password;
    }

    //RequestBody
    @PostMapping("/cr")
    String create(@RequestParam String body) {
        return body;
    }

    @PutMapping("/{id}")
    String updateUser(@PathVariable long id) {
        return "Update todo with" + id;
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable long id) {
        return "delete todo with" + id;
    }
    @Autowired
    TodoService todoService;
    @GetMapping("/get")
    String GetTodo(){
        todoService.printTodos();
        return "Checku";
    }

}
