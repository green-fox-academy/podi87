package com.greenfoxacademy.guardian.controller;

import com.greenfoxacademy.guardian.model.GuardianErrorHandling;
import com.greenfoxacademy.guardian.model.Guardians;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @ExceptionHandler(Exception.class)
  public GuardianErrorHandling message(Exception e) {
    return new GuardianErrorHandling("I am Groot!");
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Guardians groot(@RequestParam(name = "message", required = false) Guardians groot) {
    return new Guardians(groot.getReceived());
  }


}
