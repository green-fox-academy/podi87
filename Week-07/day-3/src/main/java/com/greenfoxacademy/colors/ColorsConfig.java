package com.greenfoxacademy.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorsConfig {

  @Bean
  public RedColor redColor() {
    return new RedColor();
  }
  @Bean
  public BlueColor blueColor() {
    return new BlueColor();
  }
  @Bean
  public GreenColor greenColor() {
    return new GreenColor();
  }
}
