package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.Drinks;
import com.greenfoxacademy.programmerfoxclub.Food;
import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/index1")
  public String index(Model model) {
    model.addAttribute("foxName", fox.getName());
    model.addAttribute("food", fox.getDrink().toString());
    model.addAttribute("drink", fox.getEatFood().toString());
    model.addAttribute("knownTricks", fox.getKnownTricks());
    model.addAttribute("trick0",  fox.getTrick());
    return "index1";
  }

  @RequestMapping("/nutrition")
  public String nutrition(Model model) {
    model.addAttribute("foods", Food.values());
    model.addAttribute("drinks", Drinks.values());
    return "nutrition";
  }

  @RequestMapping("/nutrition/change")
  public String changeValue(@RequestParam("food") String food, @RequestParam("drink") String drink) {
    if (food.equals("")) {
      food = "NOTHING";
    }
    if (drink.equals("")) {
      drink = "NOTHING";
    }
//    fox.setDrink(drink);
//    fox.setEatFood(food);
    return "redirect:/nutrition";
  }

}
