package com.example.interview1.Repository;

import com.example.interview1.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer> {
}
