package com.example.springweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springweb.Exception.ResourceNotFoundException;
import com.example.springweb.Repository.StudentsRepository;
import com.example.springweb.model.Students;

@Service
public class StudentsService {

    StudentsRepository repo;
    //constructor injection 
    public StudentsService(StudentsRepository repo){
        this.repo = repo;
    }

    public List<Students> getAllStudent(){

        return repo.findAll();
    }
    
    public Students addStudentBy(Students student){
        repo.save(student);
        return student;
    }

    public Students getStudentById(int id){

        return repo.findById(id).orElseThrow( ()-> new ResourceNotFoundException("Student NOt found") );
    }
}

