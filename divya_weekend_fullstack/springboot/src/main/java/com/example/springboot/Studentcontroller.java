package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Studentcontroller {

    
    private final StudentService service;

    Studentcontroller(StudentService service){
        this.service = service;
    }

    @GetMapping("/service")
    public String getService(){
        return service.getStudents();
    }

    @GetMapping("/repository")
    public String getRepo(){
        return service.getRepo();
    }


    @GetMapping("/")
    public String sayHello(){
        return "Hello there";
    }
    
}
