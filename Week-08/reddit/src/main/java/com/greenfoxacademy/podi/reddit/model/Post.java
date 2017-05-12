package com.greenfoxacademy.podi.reddit.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Posts")
@Getter
@Setter
@Component
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "Title")
  private String title;

  @Column(name = "Link")
  private String href;

  @Column(name = "Timestamp")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Timestamp timestamp;

  @Column(name = "Score")
  private int score;


  public Post(){}

  public Post(String title, String href, Timestamp timestamp){
    this.title = title;
    this.href = href;
    this.timestamp = timestamp;
  }

  @Override
  public String toString(){
    return title;
  }


}
