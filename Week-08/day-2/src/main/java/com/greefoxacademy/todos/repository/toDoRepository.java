package com.greefoxacademy.todos.repository;


import com.greefoxacademy.todos.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long>{

}

