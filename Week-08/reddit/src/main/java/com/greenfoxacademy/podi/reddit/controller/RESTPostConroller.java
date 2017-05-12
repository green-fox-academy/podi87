package com.greenfoxacademy.podi.reddit.controller;

import com.greenfoxacademy.podi.reddit.model.Post;
import com.greenfoxacademy.podi.reddit.model.PostErrorHandling;
import com.greenfoxacademy.podi.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTPostConroller {
  @Autowired
  PostRepository postRepository;
  @Autowired
  Post post;

  @ExceptionHandler(Exception.class)
  public PostErrorHandling message(Exception e) {
    return new PostErrorHandling("Please provide a valid id!");
  }

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Iterable<Post> listPost() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody() Post post) {
    Post post1 = new Post(post.getTitle(),post.getHref());
    postRepository.save(post1);
    return post;
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upVote(@PathVariable(name = "id") long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()+1);
    postRepository.save(postRepository.findOne(id));
    return postRepository.findOne(id);
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downVote(@PathVariable(name = "id") long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()-1);
    postRepository.save(postRepository.findOne(id));
    return postRepository.findOne(id);
  }

  @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
  public Post delete(@PathVariable(name = "id") long id) {
    postRepository.delete(id);
    return postRepository.findOne(id);
  }

  @RequestMapping(value = "/posts/{id}", method = RequestMethod.POST)
  public Post delete(@PathVariable(name = "id") long id, @RequestBody() Post input) {
    postRepository.findOne(id).setTitle(input.getTitle());
    postRepository.findOne(id).setHref(input.getHref());
    postRepository.save(postRepository.findOne(id));
    return postRepository.findOne(id);
  }



}
