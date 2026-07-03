package com.example.springweb;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository repo;

    // DI 
    public StudentService(StudentRepository repo){
        this.repo = repo;
    }

    public List<Student> getAllStudent(){
        return repo.findAll();
    }

    public Student addStudent(Student student){

        return repo.save(student);

    }

    public Student getStudentById(int id){
        return repo.findById(id);
    }

    public Student updateStudent(int id , Student student){
        return repo.update(id, student);
    }

    public boolean deleteStudent(int id){
        return repo.delete(id);
    }
}
