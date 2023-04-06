package com.example.interview1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  /*  Create a social media platform,
    User = UserId, Name, Age, List<Post>, List<Notification>
            Post = Content, Time, User, Like;
    Notification = Post, Time
    Description: A user will create a post and will receive notification wrt the post (for likes).
    POST API - Add a User
    POST API - Add a Post under given user
    PUT API - Like a given post
    POST API - Send a notification each time a post is liked.
    FInd the user who got most overall likes over all posts  */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Post> postList = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Notification> notificationList = new ArrayList<>();

}
