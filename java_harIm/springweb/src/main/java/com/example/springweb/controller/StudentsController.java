package com.example.springweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springweb.model.Students;
import com.example.springweb.service.StudentsService;

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

    @PostMapping("/add")
    public Students addStudent(@RequestBody Students student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        return service.addStudentBy(student);
    }

}
