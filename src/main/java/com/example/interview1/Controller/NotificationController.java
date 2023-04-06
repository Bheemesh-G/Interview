package com.example.interview1.Controller;


import com.example.interview1.Dto.NotificationDto;
import com.example.interview1.Entity.User;
import com.example.interview1.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;


    @PostMapping("/add-notification")
    public User addNotification(@RequestBody NotificationDto notificationDto)
    {
        return notificationService.addNotification(notificationDto);
    }
}
