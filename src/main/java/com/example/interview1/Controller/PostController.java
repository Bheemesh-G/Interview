package com.example.interview1.Controller;


import com.example.interview1.Entity.User;
import com.example.interview1.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;


    @PutMapping("/post-like/{id}")
    public String updatePost(@PathVariable int id)
    {
        return postService.updatePost(id);
    }


    @GetMapping("/maximum-posts-liked-user")
    public User findMaxUser()
    {
        return postService.findMaxUser();
    }
}
