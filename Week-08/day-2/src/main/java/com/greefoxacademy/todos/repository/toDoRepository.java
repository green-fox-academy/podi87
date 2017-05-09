package com.greefoxacademy.todos.repository;


import com.greefoxacademy.todos.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface toDoRepository extends CrudRepository<ToDo, Long>{
}
