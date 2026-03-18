package com.example.validatorspringjpa.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.validatorspringjpa.model.User;
import com.example.validatorspringjpa.service.Userservice;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/user")
public class Usercontroller {

    private Userservice userservice;
    public Usercontroller(Userservice userservice){
    this.userservice = userservice;
    }

    @GetMapping
    public List<User> getUser(){
    return userservice.getUser();
    }

    @PostMapping
    public User postUser(@Valid @RequestBody User user){
    return userservice.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserbyId(@PathVariable int id){
    return userservice.getUserById(id);
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
    return userservice.deleteUserById(id);
    }

   
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @Valid @RequestBody User user){
    return userservice.updateUserById(id, user);
    }

    @GetMapping("/name/{name}")
    public List<User> getUserByName(@PathVariable String name ){
        return userservice.getUserByName(name);
    }

    @GetMapping("/email/{email}")
    public List<User> getUserByEmail(@PathVariable String email){
        return userservice.getUserByEmail(email);

    }
    @PostMapping("/finduser")
    public List<User> getUserByNameNative(@Param("name") String name){
        return userservice.getUserByNameNative(name);
    }

    @PostMapping("/upload")
    public String fildUpload(@RequestParam("file") MultipartFile file ){

        try {
            Path path = Paths.get("uploads/" + file.getOriginalFilename());
            Files.createDirectories(path.getParent());
            Files.write(path , file.getBytes());

            return "File uploaded successfully";
        } catch (Exception e) {
            return "File upload failed";
        }
    }
}