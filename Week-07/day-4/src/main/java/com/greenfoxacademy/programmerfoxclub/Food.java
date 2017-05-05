package com.greenfoxacademy.programmerfoxclub;

import lombok.Getter;

@Getter
public enum Food {
  pizza, pancake, apple, broccoli;

  public static Food getFood(int input) {
    return Food.values()[input];
  }
}
