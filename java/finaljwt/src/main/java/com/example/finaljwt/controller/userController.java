package com.example.finaljwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finaljwt.jwt.JwtUtil;
import com.example.finaljwt.model.userModel;

@RestController
public class userController {
    
    
    @Autowired
    private JwtUtil jwtUtil;

  

    @GetMapping("/hello")
    public String sayHello(){
       
        System.out.println( SecurityContextHolder.getContext().getAuthentication());

        return "Hello Spring boot";
    }

    @GetMapping("/data")
    public String sayData(){
        return "Hello Spring boot Data";
    }

    @PostMapping("/login")
    public String loginMethod(@RequestBody userModel model){
        
        String username = "pirithika";
        String password = "1234";
        System.out.println(model.getUsername());
        System.out.println(model.getPassword());

        if(username.equals(model.getUsername()) && password.equals(model.getPassword())){
            return jwtUtil.generateToken(model.getUsername());
        }
        return "Invalid credentials";


    }

}
