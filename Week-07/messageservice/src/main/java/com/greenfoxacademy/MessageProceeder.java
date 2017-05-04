package com.greenfoxacademy;


import com.greenfoxacademy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService email;
  @Autowired
  MessageService twitter;
  String m;


  public void processMessage(String message, String address){
    m = "";
    for (int i = 0; i < address.length(); i++) {
      if (address.charAt(i) == '@'){
        m = email.sendMessage(message, address);
      } else {
        m = twitter.sendMessage(message, address);
      }
    }
    System.out.println(m);
  }
}
