package com.example.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor 
@Getter 
@Setter 
@Entity 
@Table (name = "students")
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollNo;
    private String name;
    private String course;
    private String fees;


    // constructors
    // getters and setters 
    
}


// lombok