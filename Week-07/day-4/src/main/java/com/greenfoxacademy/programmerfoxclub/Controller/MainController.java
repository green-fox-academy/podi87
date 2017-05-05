package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/index1")
  public String index(Model model) {
    model.addAttribute("foxName", fox.getName());
    model.addAttribute("food", fox.getDrink().toString());
    model.addAttribute("drink", fox.getEatFood().toString());
    return "index1";
  }

}
