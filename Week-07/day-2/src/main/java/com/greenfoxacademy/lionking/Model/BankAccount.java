package com.greenfoxacademy.lionking.Model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.text.DecimalFormat;

@Getter
@AllArgsConstructor
public class BankAccount {

  private String name;
  private int balance;
  private String animalType;

}
