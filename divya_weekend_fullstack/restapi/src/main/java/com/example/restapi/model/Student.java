package com.example.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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


    @NotBlank(message = "Student name is required")
    @Size(min = 3, max = 50, message = "Name must be betweeen 3 and 50")
    private String name;

    @NotBlank (message = "Course name is required")
    private String course;

    @NotBlank (message = "Fess must be greater than zero")
    private String fees;


    // constructors
    // getters and setters 
    
}


// lombok