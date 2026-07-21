package com.example.springsecurity.controller;

import java.net.http.HttpRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.model.User;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Usercontroller {

    @GetMapping("/")
    public String sayHell(){
        return "Hello there";
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        return "user added successfully";
    }

    @GetMapping("/csrf")
    public CsrfToken csrf(HttpServletRequest http){
        return (CsrfToken) http.getAttribute("_csrf");
    }
    
}
