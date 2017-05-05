package com.greenfoxacademy.programmerfoxclub;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Fox {
  String name;
  Drinks drink;
  Food eatFood;
  String trick;
  int knownTricks;
  @Autowired
  Tricks tricks;


  public Fox() {
    name = "Mr.Green";
    eatFood = Food.getFood(1);
    drink = Drinks.getDrink(1);
    try {
      trick = tricks.trickList.get(0);
    } catch (NullPointerException | IndexOutOfBoundsException e) {
      trick = "You know no tricks yet. Go an learn some new.";
    }
    try {
      if (tricks.trickList.isEmpty()) {
        knownTricks = 0;
      } else {
        knownTricks = tricks.trickList.size();
      }
    } catch (NullPointerException e) {
      e.getMessage();
    }
  }
}
