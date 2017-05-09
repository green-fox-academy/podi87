package com.greefoxacademy.todos;

import com.greefoxacademy.todos.model.ToDo;
import com.greefoxacademy.todos.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {
	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		toDoRepository.save(new ToDo("Start the day"));
		toDoRepository.save(new ToDo("Finish H2 workshop"));
		toDoRepository.save(new ToDo("Finish JPA workshop"));
		toDoRepository.save(new ToDo("Create a CRUD project"));
		toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
	}
}
