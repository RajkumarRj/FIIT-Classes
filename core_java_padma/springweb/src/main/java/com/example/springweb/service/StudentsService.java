package com.example.springweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springweb.Repository.StudentsRepository;
import com.example.springweb.exception.ResourceNotFoundException;
import com.example.springweb.model.StudentsModel;


@Service
public class StudentsService {

    private StudentsRepository repo;

    public StudentsService(StudentsRepository repo){
        this.repo = repo;
    }

    public List<StudentsModel> getAllstudent(){
        return repo.findAll();
    }

    public StudentsModel getStudentsId(int id){
        return repo.findById(id).orElseThrow( ()->new ResourceNotFoundException("Student not found") );
    }

    public StudentsModel saveStudents(StudentsModel student){
        return repo.save(student);
    }

}
