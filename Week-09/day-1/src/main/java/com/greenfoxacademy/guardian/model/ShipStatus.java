package com.greenfoxacademy.guardian.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipStatus {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public ShipStatus(Ship ship) {
    this.caliber25 = ship.getCaliber25();
    this.caliber30 = ship.getCaliber30();
    this.caliber50 = ship.getCaliber50();
    this.shipstatus = ship.getShipstatus();
    this.ready = ship.isReady();
  }


}
