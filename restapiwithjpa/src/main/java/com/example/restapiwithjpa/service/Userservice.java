package com.example.restapiwithjpa.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.restapiwithjpa.model.User;
import com.example.restapiwithjpa.Repository.UserRepository;

@Service
public class Userservice {

    private final UserRepository userRepository;

    // Dependency Injection
    public Userservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
        return userRepository.findAll(); // Fetches all rows from MySQL
    }

    public User addUser(User user) {
        return userRepository.save(user); // JPA generates the ID and saves it
    }

    public User getUserById(int id) {
        // .orElse(null) prevents a crash if the ID doesn't exist
        return userRepository.findById(id).orElse(null); 
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "Deleted Successfully";
    }

    public User updateUserById(int id, User updatedUser) {
        updatedUser.setId(id);
        // The save() method updates an existing record if the ID is already present
        userRepository.save(updatedUser); 
        return updatedUser;
    }
}