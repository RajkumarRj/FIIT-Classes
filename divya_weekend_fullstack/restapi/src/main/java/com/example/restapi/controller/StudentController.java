package com.example.restapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;

@RestController 
@RequestMapping("/api/v1")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }


    @GetMapping("/students")
    public List<Student> getAllStudents(){

        return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){

        return service.getStudentById(id);
    }


    @PostMapping("/students")
    public ResponseEntity<Student>  addStudent(@RequestBody Student student){

        Student  savedStudent = service.addStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }


    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable  int id){
        

        return service.deleteStudent(id) ? "Student deleted successfully" :"Student id not found";

    }





}
