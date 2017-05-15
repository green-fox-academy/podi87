package com.greenfoxacademy.guardian.controller;


import com.greenfoxacademy.guardian.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {
  @Autowired
  Ship ship;


  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseStatus(code = HttpStatus.NO_CONTENT)
  public GuardianErrorHandling messageGroot(MissingServletRequestParameterException e){
    String errorMessage = e.getParameterName();
    return new GuardianErrorHandling(errorMessage);
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public GuardiansGroot groot(@RequestParam(name = "message", required = true) GuardiansGroot groot) {
    return new GuardiansGroot(groot.getReceived());
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public GuardiansArrow yonda(@RequestParam(name = "distance") double dist, @RequestParam(name = "time") double tim) {
    return new GuardiansArrow(dist, tim);
  }

  @RequestMapping(value = "/rocket" , method = RequestMethod.GET)
  public ShipStatus cargo() {
    return ship.getStatus();
  }

  @RequestMapping(value = "/rocket/fill" , method = RequestMethod.GET)
  public ShipReport fillCargo(@RequestParam(name = "caliber") double caliber, @RequestParam(name = "amount") int amount) {
    return ship.getReport(caliber, amount);
  }

}
