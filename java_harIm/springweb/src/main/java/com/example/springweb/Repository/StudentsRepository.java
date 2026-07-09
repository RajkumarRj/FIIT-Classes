package com.example.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springweb.model.Students;

public interface StudentsRepository extends JpaRepository<Students,Integer>{
    
}
