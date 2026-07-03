package com.example.springweb;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller + requestbody
public class StudentController {
    
    // http methods 

    // get , post, put, delete, patch

    
    StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }
    
    @GetMapping("/home")
    public List<Student> sayHello(){
        return service.getAllStudent();
    }

    //  @GetMapping("/")
    // public String Login(){
    //     return "Login";
    // }

    @PostMapping("/add")
    public Student  addStudent(@RequestBody Student student){
       System.out.println(student.getId());
       System.out.println(student.getAge());
       System.out.println(student.getName());
        return service.addStudent(student);
    }


    @GetMapping("find/{id}")
    public Student getById(@PathVariable int id){
        return service.getStudentById(id);
        
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id , @RequestBody Student student){
        return service.updateStudent(id, student);

    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return service.deleteStudent(id) ? "Deleted Successfully" :"Student not found";
        
    }

}
