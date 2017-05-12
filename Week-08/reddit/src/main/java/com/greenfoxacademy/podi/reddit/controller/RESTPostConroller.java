package com.greenfoxacademy.podi.reddit.controller;

import com.greenfoxacademy.podi.reddit.model.Post;
import com.greenfoxacademy.podi.reddit.model.PostErrorHandling;
import com.greenfoxacademy.podi.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping(value = "/post", method = RequestMethod.GET)
  public Iterable<Post> listPost() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public Post addPost(@RequestBody() Post post) {
    Post post1 = new Post(post.getTitle(),post.getHref());
    postRepository.save(post1);
    return post;
  }
}
