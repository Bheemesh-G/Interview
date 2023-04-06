package com.example.interview1.Service;


import com.example.interview1.Dto.UserDto;
import com.example.interview1.Entity.User;
import com.example.interview1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserDto userDto)
    {
        User user = new User();
        user.setAge(userDto.getAge());
        user.setName(userDto.getName());

        userRepository.save(user);

        return "User added";
    }

  //  FInd the user who got most overall likes over all posts
}
