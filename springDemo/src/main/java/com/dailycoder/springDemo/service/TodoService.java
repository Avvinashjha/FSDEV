package com.dailycoder.springDemo.service;
import com.dailycoder.springDemo.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    public List<Todo> todos = new ArrayList<Todo>();
    private int currentId = 1;

    public int addTodo(String title) {
        Todo todo = new Todo(currentId++, title, false);
        todos.add(todo);
        return currentId-1;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public Todo getTodoById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public void updateTodo(int id, String title, boolean completed) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setTitle(title);
                todo.setCompleted(completed);
                break;
            }
        }
    }

    public void markAsCompleted(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(true);
                break;
            }
        }
    }

    public void markAsUncompleted(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(false);
                break;
            }
        }
    }

    public void deleteTodoById(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }
}
