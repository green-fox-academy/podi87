package com.greenfoxacademy.podi.reddit.controller;

import com.greenfoxacademy.podi.reddit.model.Post;
import com.greenfoxacademy.podi.reddit.model.PostErrorHandling;
import com.greenfoxacademy.podi.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;


@RestController
public class RESTPostConroller {
  @Autowired
  PostRepository postRepository;
  @Autowired
  Post post;

  @ExceptionHandler(Exception.class)
  public PostErrorHandling message(Exception e) {
    return new PostErrorHandling("Please provide a number!");
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Iterable<Post> listPost() {
    postRepository.save(new Post("something_new", "www.youtube.com", new Timestamp(System.currentTimeMillis()/1000)));
    return postRepository.findAll();

  }
}
