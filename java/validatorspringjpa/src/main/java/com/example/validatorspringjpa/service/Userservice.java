package com.example.validatorspringjpa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.example.validatorspringjpa.model.User;
import com.example.validatorspringjpa.repository.UserRepository;


@Service
public class Userservice {
    Map<Integer, User> users = new HashMap<>();

    public UserRepository userRepository;

    public Userservice(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    private int currentId =1;

    public List<User> getUser(){
    return userRepository.findAll();
    }

    public User addUser(User user) {
    return userRepository.save(user);
    }

    public User getUserById(int id){
    return userRepository.findById(id).orElse(null);
    }

    public String deleteUserById(int id){
    users.remove(id);
    return "Deleted Successfully";
    }

    public User updateUserById(int id, User updatedUser){
    updatedUser.setId(id);
    users.put(updatedUser.getId(), updatedUser);
    return updatedUser;
    }

}
