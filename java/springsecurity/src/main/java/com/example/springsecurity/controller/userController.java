package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class userController {

    @GetMapping("/")
    public String sayHello(HttpServletRequest http) {
        return "Hello request " + http.getSession().getId();
    }

    @GetMapping("/home")
    public String getHome() {
        return "Home page ";
    }    
    
    @PostMapping("/post")
    public String addData(@RequestBody String data) {
        //TODO: process POST request

        return "post working fine ";

    }

    @GetMapping("/csrf_token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    
}
