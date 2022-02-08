package com.example.springpractice.dao;

import com.example.springpractice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
}
