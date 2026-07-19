package com.example.security_jwt.controller;

import com.example.security_jwt.model.User;
import com.example.security_jwt.service.userService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    userService service ;

    public userController(userService service) {
        this.service = service;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest request) {

        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/")
    public List<User> getAllUser(){

        return service.getAllUsers();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        System.out.println("createUser");
        return service.createUsers(user);
    }
}
