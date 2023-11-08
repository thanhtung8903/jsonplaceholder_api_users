package com.example.practiceapi.service;

import com.example.practiceapi.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(int id);
}
