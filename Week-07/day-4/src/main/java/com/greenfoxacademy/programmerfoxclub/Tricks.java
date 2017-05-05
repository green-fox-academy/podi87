package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tricks {

  List<String> trickList = new ArrayList<>();

  public List<String> getTrickList() {
    return trickList;
  }

  public List addTricks(String input){
    trickList.add(input);
    return  trickList;
  }
}
