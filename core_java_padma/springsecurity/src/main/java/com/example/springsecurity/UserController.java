package com.example.springsecurity;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {


    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring securdfsadfsdfaity";
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserModel user){
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "User added successfully";
    }
    
    // jwt authentication 
}
