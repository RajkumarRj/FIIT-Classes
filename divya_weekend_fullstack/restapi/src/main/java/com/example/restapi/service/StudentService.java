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

        return repo.findAll();
    }

    public Student getStudentById(long id){
        return repo.findById(id).orElse(null);
    }

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public boolean deleteStudent(long id){
        repo.deleteById(id);

        return true;
    }

    public Student updateStudent(long id, Student student){

       Student existingStudent =  repo.findById(id).orElse(null);

       existingStudent.setName(student.getName());
       existingStudent.setCourse(student.getCourse());
       existingStudent.setFees(student.getFees());

       return repo.save(existingStudent);

    }

    

    
}
