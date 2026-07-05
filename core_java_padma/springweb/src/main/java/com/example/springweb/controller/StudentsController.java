package com.example.springweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
    
}
