package com.greenfoxacademy.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Tricks {

  public List<String> getTricksList() {
    return tricksList;
  }

  List<String> tricksList = new ArrayList<>();

  public List<String> addTricks(String newTrick) {
    tricksList.add(newTrick);
    return tricksList;
  }

}
