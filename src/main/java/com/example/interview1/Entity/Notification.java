package com.example.interview1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    //Notification = Post, Time


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String notificationTime;

    @OneToOne
    @JoinColumn
    Post post;

    @ManyToOne
    @JoinColumn
    User user;
}
