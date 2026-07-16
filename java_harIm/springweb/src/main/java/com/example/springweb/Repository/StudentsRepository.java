package com.example.springweb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springweb.model.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Integer>{
    
    @Query(value =  "SELECT u FROM student u WHERE u.course = :course") 
    List<Students> findByCourse(String course);
}


// crud ,  spring security , multipart file ,  