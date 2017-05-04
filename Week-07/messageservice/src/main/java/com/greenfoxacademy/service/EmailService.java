package com.greenfoxacademy.service;


public class EmailService implements MessageService {


  @Override
  public String sendMessage(String message, String address) {
    return "Email sent to: " + address + " with Message: " + message;
  }
}
