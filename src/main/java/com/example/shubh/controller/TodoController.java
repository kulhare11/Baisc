package com.example.shubh.controller;

import com.example.shubh.entity.Todo;
import com.example.shubh.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Todo> getAll()
    {
        return service.getAll();
    }
    @PostMapping
    public Todo create(@RequestBody Todo todo)
    {
        return service.create(todo);
    }
    @PutMapping("/id")
    public Todo update(@PathVariable Long id,
                       @RequestBody Todo todo)
    {
        return service.update(id,todo);
    }
    @DeleteMapping("/id")
    public void delete(@PathVariable Long id)
    {
        service.delete(id);
    }


}
