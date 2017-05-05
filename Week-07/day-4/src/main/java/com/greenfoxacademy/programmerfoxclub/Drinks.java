package com.greenfoxacademy.programmerfoxclub;

import lombok.Getter;

@Getter
public enum Drinks {
  beer, coke, soda, water;

  public static Drinks getDrink(int input) {
    return Drinks.values()[input];
  }
}
