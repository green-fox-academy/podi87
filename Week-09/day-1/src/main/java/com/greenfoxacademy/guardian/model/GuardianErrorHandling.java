package com.greenfoxacademy.guardian.model;


import java.util.Objects;

public class GuardianErrorHandling {

  String error;

  public GuardianErrorHandling(String error) {
    if (Objects.equals(error, "message")) {
      this.error = "I am Groot!";
    } else if ((Objects.equals(error, "distance")) || (Objects.equals(error, "time"))) {
      this.error = "I am Yondu!";
    }
  }

  public String getError() {
    return error;
  }
}
