package com.greenfoxacademy.postman.doubling;


public class Doubling {

  private int received;
  private  int  result;

  public Doubling(int received) {
    this.received = received;
    this.result = received *2;
  }

  public int getResult() {
    return result;
  }

  public int getReceived() {
    return received;
  }
}
