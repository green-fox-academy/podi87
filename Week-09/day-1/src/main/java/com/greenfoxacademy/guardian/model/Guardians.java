package com.greenfoxacademy.guardian.model;




public class Guardians {

  private String received;

  public String getTranslated() {
    return translated;
  }

  private  String translated;

  public String getReceived() {
    return received;
  }

  public Guardians(String message) {

    this.received = message;
    this.translated = "I am Groot!";
  }
}
