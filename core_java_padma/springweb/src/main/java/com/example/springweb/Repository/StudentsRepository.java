package com.example.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springweb.model.StudentsModel;

public interface StudentsRepository extends JpaRepository<StudentsModel, Integer>{
    
}
