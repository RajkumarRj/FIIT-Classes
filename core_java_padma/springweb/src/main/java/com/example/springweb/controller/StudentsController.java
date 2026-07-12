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

import com.example.springweb.model.StudentsModel;
import com.example.springweb.service.StudentsService;

@RestController
@RequestMapping("/jpa")
public class StudentsController {

    private StudentsService service;

    // DI 
    public StudentsController(StudentsService service){
        this.service = service;
    }

    @GetMapping("/list")
    public List<StudentsModel> getStudent(){
        return service.getAllstudent();
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<StudentsModel> getStudentById(@PathVariable int id){
        return ResponseEntity.status(200).body(service.getStudentsId(id));

    }

    @PostMapping("/addStudent")
    public ResponseEntity<StudentsModel> saveSStudent(@RequestBody StudentsModel student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        return ResponseEntity.status(201).body(service.saveStudents(student));
    }
    
}
