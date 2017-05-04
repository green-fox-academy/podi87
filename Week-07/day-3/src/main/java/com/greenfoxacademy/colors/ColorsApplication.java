package com.greenfoxacademy.colors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

  @Autowired
  RedColor rc;
  @Autowired
  BlueColor bc;
  @Autowired
  GreenColor gc;

  public static void main(String[] args) {
    SpringApplication.run(com.greenfoxacademy.colors.ColorsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  rc.printColor();
  bc.printColor();
  gc.printColor();
  }

}
