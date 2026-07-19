package com.example.security_jwt.service;

import com.example.security_jwt.model.User;
import com.example.security_jwt.repository.userRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    
    userRepository repo ;
    
    public userService(userRepository repo) {
        this.repo = repo;
    }
    
    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public User createUsers(User user){
        return repo.save(user);
    }
    
}
