package com.greenfoxacademy.lionking.Controller;

import com.greenfoxacademy.lionking.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {

  @RequestMapping("/Exercise3")
  public String addBankAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", simba);
    return "Exercise3";
  }
  @RequestMapping("/Exercise4")
  public String hello(Model model) {
    model.addAttribute("html", "<em>HTML</em>");
    model.addAttribute("enjoy", "<b>Enjoy yourself!</b>");
    return "Exercise4";
  }
}
