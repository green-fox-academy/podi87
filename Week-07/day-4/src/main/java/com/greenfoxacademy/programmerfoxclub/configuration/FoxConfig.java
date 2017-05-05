package com.greenfoxacademy.programmerfoxclub.configuration;

import com.greenfoxacademy.programmerfoxclub.Drinks;
import com.greenfoxacademy.programmerfoxclub.Food;
import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class FoxConfig {

  public Fox fox(){
    return new Fox("Mr.Green", Drinks.getDrink(1), Food.getFood(1));
  }
}
