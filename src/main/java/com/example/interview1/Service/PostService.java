package com.example.interview1.Service;


import com.example.interview1.Dto.PostDto;
import com.example.interview1.Entity.Post;
import com.example.interview1.Entity.User;
import com.example.interview1.Repository.PostRepository;
import com.example.interview1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    //POST API - Send a notification each time a post is liked.
    //PUT API - Like a given post
    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    public String updatePost(int postId)
    {
       Post post = postRepository.findById(postId).get();

       post.setLike(post.getLike()+1);

       postRepository.save(post);

       return "Post liked";

    }

    public User findMaxUser()
    {
        int id = postRepository.idOfMaximumLikes();

        User user = userRepository.findById(id).get();

        return user;
    }
}
