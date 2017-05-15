package com.greenfoxacademy.guardian.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuardiansArrow {

  private double distance;
  private double time;
  private double speed;

  public GuardiansArrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance/time;
  }

}
