package com.amos.firstappspring.controller;
import com.amos.firstappspring.entity.Post;
import com.amos.firstappspring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService postService;
    @RequestMapping("/posts")
    public List<Post> getAllPost(){
        return postService.getAllPosts();
    }

    @RequestMapping("/posts/{id}")
    public Optional<Post> getPost(@PathVariable String id){
        return postService.getPost(id);
    }

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PutMapping("/posts/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable String id){
        postService.updatePost(post, id);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable String id){
        postService.deletePost(id);
    }
}
