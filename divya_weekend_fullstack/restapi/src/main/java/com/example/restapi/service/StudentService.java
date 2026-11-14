package com.example.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restapi.model.Student;
import com.example.restapi.repository.StudentRepository;

@Service 
public class StudentService {


    // Depdency injection 
    // field
    // setter 
    // constructor 
    private  StudentRepository repo;

    public StudentService(StudentRepository repo){
        this.repo = repo;
    }

    public List<Student> getAllStudents(){

        return repo.findAall();
    }

    public Student getStudentById(int id){
        return repo.findById(id);
    }

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public boolean deleteStudent(int id){
        return repo.deleteById(id);
    }

    

    
}
