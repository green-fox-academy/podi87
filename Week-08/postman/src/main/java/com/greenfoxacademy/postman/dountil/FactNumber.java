package com.greenfoxacademy.postman.dountil;

public class FactNumber extends Number{


  private int result;


  @Override
  public int getResult() {
    return result;
  }

  public FactNumber(int until) {
    this.result = factorial(until);
  }




}
