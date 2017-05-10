package com.greenfoxacademy.postman.doubling;


import org.springframework.web.bind.annotation.*;

@RestController
public class RESTController {

  @ExceptionHandler(Exception.class)
  public ErrorHandling message(Exception e) {
    return new ErrorHandling("Please provide an input!");
  }


  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(name = "input", required = true) int id) {
    Doubling doubling = new Doubling(id);
    return doubling;
  }

}
