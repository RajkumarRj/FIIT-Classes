package com.example.SpringWeb;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {


    // @Autowired
    StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }
    // student 
    @GetMapping("/")
    public List<Student> Sayhello(){
        return service.getAllStudents();
    }

    // student/home 

     @GetMapping("/home")
    public String SayHome(){
        return "Home";
    }

    // student/add
    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        return service.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id){

        return service.getStudentByid(id);

    }


    // /student/id 
    
}
