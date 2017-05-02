package com.greenfoxacademy.springstart.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greetings greeting(@RequestParam String name) {
    Greetings greetings = new Greetings(1, "Hello, " + name);
    return greetings;
  }
}
