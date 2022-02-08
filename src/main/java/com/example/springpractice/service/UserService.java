package com.example.springpractice.service;

import com.example.springpractice.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUser();
    User saveUser(User user);
}
