package com.greenfoxacademy.programmerfoxclub;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Fox {
  String name;
  Drinks drink;
  Food eatFood;

  public Fox() {
    name = "Mr.Green";
    eatFood = Food.getFood(1);
    drink = Drinks.getDrink(1);
  }

//  public String knowsTricks(String newTrick) {
//    tricks.addTricks(newTrick);
//    return tricks.getTricksList().toString();
//  }
}
