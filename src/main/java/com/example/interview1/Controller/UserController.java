package com.example.interview1.Controller;


import com.example.interview1.Dto.UserDto;
import com.example.interview1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;



    @PostMapping("/add-user")
    public String addUser(@RequestBody UserDto userDto)
    {
        return userService.addUser(userDto);
    }




}
