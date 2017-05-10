package com.greenfoxacademy.postman.dountil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @Autowired
  Number number;

  @ExceptionHandler(Exception.class)
  public DoUntilErrorHandling message(Exception e) {
    return new DoUntilErrorHandling("Please provide a number!");
  }


  @RequestMapping(value = "/dountil/{what}",  method = RequestMethod.POST)
  public Number number(@PathVariable(name = "what") String input, @RequestBody() DoUntil until) {
    if(input.equals("sum")) {
      number = new SumNumber(until.getUntil());
    } else if (input.equals("factorial")) {
      number = new FactNumber(until.getUntil());
    }
    return number;
  }
}
