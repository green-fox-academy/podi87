package com.greefoxacademy.todos.controller;


import com.greefoxacademy.todos.repository.toDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/todo")
public class MainController {

  @Autowired
  toDoRepository toDoRepository;

  @RequestMapping({"/","/list"})
  public String list(Model model){

    return "todolist";
  }

  


}
