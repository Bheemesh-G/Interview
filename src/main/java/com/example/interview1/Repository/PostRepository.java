package com.example.interview1.Repository;

import com.example.interview1.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository  extends JpaRepository<Post,Integer> {


    @Query(value="select user_id from post where like=(select max(like) from post)",nativeQuery = true)
    int idOfMaximumLikes();
}
