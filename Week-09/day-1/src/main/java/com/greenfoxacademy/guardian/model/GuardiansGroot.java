package com.greenfoxacademy.guardian.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class GuardiansGroot {


  private String received;
  private String translated;


  public GuardiansGroot(String message) {

    this.received = message;
    this.translated = "I am Groot!";
  }


}
