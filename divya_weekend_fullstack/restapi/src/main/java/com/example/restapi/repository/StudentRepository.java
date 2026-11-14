package com.example.restapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.restapi.model.Student;

@Repository 
public class StudentRepository {

    private List<Student> students = new ArrayList<>();


     private long count = 1;

    public StudentRepository(){
        students.add(new Student(count++, "Divya", "Spring boot", "35000"));
        students.add(new Student(count++, "Sathish", "React", "20000"));
    }


    public List<Student>  findAall(){
        return students;
    }

    public Student findById(int id){
        return students.stream()
                .filter(stud -> stud.getRollNo() == id)
                .findFirst()
                .orElse(null);         
    }

    public Student save(Student student){
        
        students.add(student);

        return  student;
    }

    public boolean deleteById(int id){
        
        return students.removeIf(student -> student.getRollNo() == id);
    }



    
}
