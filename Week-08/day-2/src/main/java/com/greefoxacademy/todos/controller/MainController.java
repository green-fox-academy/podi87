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

  @RequestMapping("/delete")
  public String delete(Model model,
                         @RequestParam(name = "delID", required = false) long delID){
    toDoRepository.delete(delID);
    return "redirect:/todo/";
  }

  @RequestMapping("/edit")
  public String direct(Model model) {
    return "update";
  }

  @RequestMapping("/update")
  public String update(Model model,
                       @RequestParam(name = "upID", required = false) long upID, @RequestParam(name = "newTitle", required = false) String newTitle,
                       @RequestParam(name = "doneState", required = false) boolean doneState, @RequestParam(name = "urgentState", required = false) boolean urgentState){
    toDoRepository.findOne(upID).setDone(doneState);
    toDoRepository.findOne(upID).setUrgent(urgentState);
    toDoRepository.findOne(upID).setTitle(newTitle);
    toDoRepository.save(toDoRepository.findOne(upID));
    return "redirect:/todo/";
  }


}
