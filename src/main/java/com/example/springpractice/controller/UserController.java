package com.example.springpractice.controller;

import com.example.springpractice.dao.UserDao;
import com.example.springpractice.domain.User;
import com.example.springpractice.service.UserService;
import com.example.springpractice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;
    @RequestMapping("/getUser")
    public List<User> getUser() {
        List users = userService.getUser();
        return users;
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println(user);
        userService.saveUser(user);
         return "success";
    }
}
