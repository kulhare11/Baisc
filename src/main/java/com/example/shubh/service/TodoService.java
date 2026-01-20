package com.example.shubh.service;

import com.example.shubh.entity.Todo;
import com.example.shubh.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAll()
    {
        return todoRepository.findAll();
    }
    public Todo create(Todo todo)
    {
        return todoRepository.save(todo);
    }
    public Todo update(Long id, Todo todo)
    {
        todo.setId(id);
        return todoRepository.save(todo);
        
    }
    public void delete(Long id)
    {
        todoRepository.deleteById(id);
    }

}
