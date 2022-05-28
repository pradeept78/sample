package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import com.example.demo.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    ServiceImpl serviceImpl;

    @PostMapping("/login")
    public UserDto login(@RequestBody UserDto user){
        UserDto userData = serviceImpl.login(user);

        return userData;
    }

    @PostMapping("/login/entity")
    public User entity(@RequestBody User user){
        User userData = serviceImpl.entitylogin(user);

        return userData;
    }

    @PostMapping("/create")
    public List<User> create(@RequestBody List<User> user){
        List<User> userData = serviceImpl.createUser(user);

        return userData;
    }

}
