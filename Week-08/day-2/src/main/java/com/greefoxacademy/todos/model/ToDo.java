package com.greefoxacademy.todos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TODOS")
@Getter
@Setter
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "Things_to_do")
  private String title;
  @Column(name = "Urgent")
  private boolean isUrgent = false;
  @Column(name = "Done")
  private boolean isDone = false;

  public ToDo(){}

  public ToDo(String title){
    this.title = title;
  }

  @Override
  public String toString(){
    return title;
  }

}
