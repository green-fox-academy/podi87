package com.greenfoxacademy.podi.reddit.repository;


import com.greenfoxacademy.podi.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends CrudRepository <Post, Long> {
}
