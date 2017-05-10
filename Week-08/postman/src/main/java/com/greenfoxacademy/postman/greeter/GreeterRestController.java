package com.greenfoxacademy.postman.greeter;


import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GreeterErrorHandling message(MissingServletRequestParameterException e) {
    String errorName = e.getParameterName().toString();
    return new GreeterErrorHandling(errorName);
  }


  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeting greeter(@RequestParam(name = "name", required = true) String name, @RequestParam( name = "title", required = true) String title) {
    Greeting greeting = new Greeting(name, title);
    return greeting;
  }


}
