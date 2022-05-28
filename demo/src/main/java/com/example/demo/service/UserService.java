package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    public UserDto login(UserDto user);

    public User entitylogin(User use);

    public List<User> createUser(List<User> user);
}
