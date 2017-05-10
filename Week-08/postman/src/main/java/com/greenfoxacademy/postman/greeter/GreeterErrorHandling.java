package com.greenfoxacademy.postman.greeter;


import java.util.Objects;

public class GreeterErrorHandling {

  String error;

  public GreeterErrorHandling(String error) {
    if (Objects.equals(error, "name")) {
      this.error = "Please provide a name!";
    } else if (Objects.equals(error, "title")) {
      this.error = "Please provide a title!";
    }
  }

  public String getError() {
    return error;
  }

}
