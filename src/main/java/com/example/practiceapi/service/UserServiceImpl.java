package com.example.practiceapi.service;

import com.example.practiceapi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final String url = "https://jsonplaceholder.typicode.com/users";

    @Override
    public List<User> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        List<User> users = restTemplate.getForObject(url, List.class);
        return users;
    }

    @Override
    public User findById(int id) {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(url + "/" + id, User.class);
        return user;
    }
}
