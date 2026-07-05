package com.example.springweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springweb.Repository.StudentsRepository;
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
}
