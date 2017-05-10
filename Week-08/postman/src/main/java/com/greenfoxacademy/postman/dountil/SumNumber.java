package com.greenfoxacademy.postman.dountil;


public class SumNumber extends Number{


  private int result;

  public SumNumber(int until) {

    this.result = sum(until);
  }

  @Override
  public int getResult() {
    return result;
  }

}
