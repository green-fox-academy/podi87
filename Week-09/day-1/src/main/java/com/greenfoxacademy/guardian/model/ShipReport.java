package com.greenfoxacademy.guardian.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipReport {

  private double received;
  private int amount;
  private String shipstatus;
  private boolean ready;


  public ShipReport(Ship ship) {
    this.received = ship.getReceived();
    this.amount = ship.getAmount();
    this.shipstatus = ship.getShipstatus();
    this.ready = ship.isReady();
  }
}
