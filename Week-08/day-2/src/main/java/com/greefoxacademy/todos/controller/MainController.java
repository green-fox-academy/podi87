package com.greefoxacademy.todos.controller;


import com.greefoxacademy.todos.model.ToDo;
import com.greefoxacademy.todos.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class MainController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping({"/","/list"})
  public String listTodos(Model model){
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }

  @RequestMapping("/addToDo")
  public String addTodos(Model model,
                         @RequestParam(name = "newTodo", required = false) String newTodo){
    toDoRepository.save(new ToDo(newTodo));
    return "redirect:/todo/";
  }


}
