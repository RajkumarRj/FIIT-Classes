package com.example.security.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api")
public class userController {
    
    @GetMapping("/users")
    public String sayUser(){
        return "Hello User";
    }

                                                                                                                                                  @GetMapping("/admin")
    public String sayAdmin(){
        return "Hello Admin";
    }

    @PostMapping("/access")
    public String addData(@RequestBody String data){
        return data;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    // csrf => token 

    // /api/users

    // /api/admin
}
