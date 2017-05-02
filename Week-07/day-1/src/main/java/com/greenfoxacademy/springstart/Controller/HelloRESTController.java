package com.greenfoxacademy.springstart.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong id = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greetings greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    Greetings greetings = new Greetings(id.incrementAndGet(), "Hello, " + name);
    return greetings;
  }
}
