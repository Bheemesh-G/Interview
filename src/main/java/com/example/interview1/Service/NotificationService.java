package com.example.interview1.Service;


import com.example.interview1.Dto.NotificationDto;
import com.example.interview1.Entity.Notification;
import com.example.interview1.Entity.Post;
import com.example.interview1.Entity.User;
import com.example.interview1.Repository.NotificationRepository;
import com.example.interview1.Repository.PostRepository;
import com.example.interview1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    UserRepository userRepository;
    @Autowired
    PostRepository postRepository;
    public User addNotification(NotificationDto notificationDto)
    {
        Notification notification = new Notification();
        notification.setNotificationTime(notificationDto.getTime());

        User user = userRepository.findById(notificationDto.getUserId()).get();

        user.getNotificationList().add(notification);

        Post post = postRepository.findById(notificationDto.getPostId()).get();

        post.setNotification(notification);

        User savedUser = userRepository.save(user);

        return savedUser;

    }
}
