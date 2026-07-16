package com.example.springweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springweb.model.Students;
import com.example.springweb.service.StudentsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/jpa")
public class StudentsController {


    StudentsService service;

    public StudentsController(StudentsService service){
        this.service = service;
    }
    
    @GetMapping("/list")
    public List<Students> getStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Students> getStudentByid(@PathVariable int id){
        return ResponseEntity.status(200).body(service.getStudentById(id));
    }
    // 201 => created 
    // 200 => response success
    // 404 => not found 
    // 403 => unauthorized 

    @PostMapping("/add")
    public ResponseEntity<Students> addStudent(@Valid @RequestBody Students student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        return ResponseEntity.status(201).body(service.addStudentBy(student));
    }

    @GetMapping("/course/{cname}")
    public List<Students> getCourse(@PathVariable String cname){
        return service.getCourse(cname);
    }

}
