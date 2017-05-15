package com.greenfoxacademy.guardian.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Ship {

  private int caliber25 ;
  private int caliber30 ;
  private int caliber50 ;
  private double received;
  private int amount;
  private String shipstatus;
  private boolean ready;

  public ShipStatus getStatus() {
    ShipStatus shipStatus = new ShipStatus(this);
    return shipStatus;
  }
  public ShipReport getReport(double received, int amount) {
    setReceived(received);
    setAmount(amount);
    int fullAmount = 12500;
    int properCaliber = (int)(received * 100);

    if (properCaliber == 25) {
      setCaliber25(caliber25 += amount);
    } else if (properCaliber == 30) {
      setCaliber30(caliber30 += amount);
    } else if (properCaliber == 50) {
      setCaliber50(caliber50 += amount);
    }

    int currentAmount = caliber25 + caliber30 +caliber50;
    System.out.println(currentAmount);
    double amountPercent = ((double)currentAmount/(double) fullAmount)*100;
    System.out.println(amountPercent);
    Integer percent = (int)amountPercent;

    if (currentAmount == 0) {
      this.shipstatus = "empty";
    } else if (currentAmount > fullAmount) {
      this.shipstatus = "overloaded";
    } else {
      this.shipstatus = percent.toString() + "%";
    }

    if (currentAmount == fullAmount) {
      this.ready = true;
    } else {
      this.ready = false;
    }

    ShipReport shipReport = new ShipReport(this);
    return shipReport;
  }

  public Ship() {
    int currentAmount = caliber25 + caliber30 +caliber50;
    int fullAmount = 12500;
    double amountPercent = ((double)currentAmount/(double) fullAmount)*100;
    Integer percent = (int)amountPercent;

    if (currentAmount == 0) {
      this.shipstatus = "empty";
    } else if (currentAmount > fullAmount) {
      this.shipstatus = "overloaded";
    } else {
      this.shipstatus = percent.toString() + "%";
    }
  }
}
