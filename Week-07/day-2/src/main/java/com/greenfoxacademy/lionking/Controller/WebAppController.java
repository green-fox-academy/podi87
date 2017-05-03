package com.greenfoxacademy.lionking.Controller;

import com.greenfoxacademy.lionking.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebAppController {

  @RequestMapping("/Exercise8")
  public String addBankAccount(Model model) {
    List<BankAccount> animalList = new ArrayList<>();
    animalList.add(new BankAccount("Simba", 2000, "lion"));
    animalList.add(new BankAccount("Mufasa", 10000, "king lion"));
    animalList.add(new BankAccount("Timon", 300, "meerkat"));
    animalList.add(new BankAccount("Pumba", 50, "warthog"));
    animalList.add(new BankAccount("Zordon", 4500, "bad lion"));
    model.addAttribute("animals", animalList);
    return "Exercise8";
  }
  @RequestMapping("/Exercise4")
  public String hello(Model model) {
    model.addAttribute("html", "<em>HTML</em>");
    model.addAttribute("enjoy", "<b>Enjoy yourself!</b>");
    return "Exercise4";
  }
}
