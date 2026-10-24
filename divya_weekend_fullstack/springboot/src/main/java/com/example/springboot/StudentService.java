package com.example.springboot;

import org.springframework.stereotype.Service;

@Service 
public class StudentService {


    private final StudentRespo repo;

    StudentService(StudentRespo repo){
        this.repo = repo;
    }


    public String getRepo(){

        return repo.getRepoo();
    }


    public String getStudents(){
        return "Service layer";
    }
    
}
