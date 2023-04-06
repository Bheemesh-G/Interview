package com.example.interview1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

   // Post = Content, Time, User, Like;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private String time;

    private int like;

    @ManyToOne
    @JoinColumn
    User user;

    @OneToOne(mappedBy = "post",cascade = CascadeType.ALL)
    Notification notification;
}
