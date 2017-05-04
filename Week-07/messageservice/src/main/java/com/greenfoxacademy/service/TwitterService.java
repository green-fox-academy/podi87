package com.greenfoxacademy.service;

public class TwitterService implements MessageService {

  @Override
  public String sendMessage(String message, String address) {
    return "Tweet sent to: " + address + " with Message: " + message;
  }
}
