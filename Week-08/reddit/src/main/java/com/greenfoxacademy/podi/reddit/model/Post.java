package com.greenfoxacademy.podi.reddit.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

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
  private Long timestamp;

  @Column(name = "Score")
  private int score;


  public Post(){}

  public Post(String title, String href){
    this.title = title;
    this.href = href;
    this.timestamp = new Date().getTime()/1000;
  }

//  public Post(String title, String href, int score) {
//    this.title = title;
//    this.href = href;
//    this.timestamp =  new Date().getTime()/1000;
//    this.score = score;
//  }

  @Override
  public String toString(){
    return title;
  }


}
