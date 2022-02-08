package com.example.springpractice.service;

import com.example.springpractice.dao.UserDao;
import com.example.springpractice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired UserDao userDao;


    @Override
    public List<User> getUser() {
        return userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }
}
