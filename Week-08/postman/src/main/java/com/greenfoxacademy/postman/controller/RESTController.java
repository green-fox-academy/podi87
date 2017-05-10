package com.greenfoxacademy.postman.controller;


import com.greenfoxacademy.postman.Doubling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(name = "input", required = true) int id) {
    Doubling doubling = new Doubling(id);
    return doubling;
  }

}
