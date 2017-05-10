package com.greenfoxacademy.postman.dountil;

import org.springframework.stereotype.Component;

@Component
public class Number {

  private int result;

  public Number() {
  }

  public int getResult() {
    return result;
  }

  public int sum(int until){
    int temp=0;
    for(int i = 0; i< until + 1; i++) {
      temp=temp + i;
    }
    return temp;
  }

  public int factorial(int until)
  {
    if(until==1){
      return 1;
    }
    return factorial(until-1)* until;
  }
}
