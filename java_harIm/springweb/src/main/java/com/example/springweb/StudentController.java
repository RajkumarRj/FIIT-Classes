package com.example.springweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    // http methods 

    // get , post, put, delete, patch

    @Autowired
    StudentService service;
    
    @GetMapping("/home")
    public List<Student> sayHello(){
        return service.getAllStudent();
    }

     @GetMapping("/")
    public String Login(){
        return "Login";
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
       System.out.println(student.getId());
       System.out.println(student.getAge());
       System.out.println(student.getName());
        return "Post api working fine";
    }


}
