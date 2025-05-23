package com.dailycoder.springDemo.controller;

import com.dailycoder.springDemo.model.Todo;
import com.dailycoder.springDemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.AttributedString;
import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public ResponseEntity<List<Todo>> getTodos() {
        List<Todo> todos = todoService.getTodos();
        return ResponseEntity.ok().body(todos);
    }

    @PostMapping("/add")
    public ResponseEntity<Todo> addTodo(@RequestBody String todoTitle) {
        int id = todoService.addTodo(todoTitle);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.getTodoById(id));
    }

    @PutMapping("/update:{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable int id, @RequestBody Todo todo) {
        todoService.updateTodo(id, todo.getTitle(), todo.isCompleted());
        return ResponseEntity.ok().body(todoService.getTodoById(id));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteTodo(@RequestBody int id) {
        todoService.deleteTodo(id);
        return ResponseEntity.status(HttpStatus.OK).body("Todo deleted successfully");
    }

    @PutMapping("/markAsCompleted:{id}")
    public ResponseEntity<Todo> markAsCompleted(@PathVariable int id) {
        todoService.markAsCompleted(id);
        return ResponseEntity.ok().body(todoService.getTodoById(id));
    }

}
