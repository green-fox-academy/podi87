package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.MessageProceeder;
import com.greenfoxacademy.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean(name = "email")
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean(name = "twitter")
  public TwitterService twitterService() {
    return new TwitterService();
  }
  @Bean
  public MessageProceeder messageProceeder(){
    return new MessageProceeder();
  }
}
