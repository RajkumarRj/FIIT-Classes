package com.example.springweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // IOC 
public class StudentRepository {

     private  List<Student> ls = new ArrayList<>(); 

     public StudentRepository(){
         ls.add(new Student(1, "FIIT", 23));
        ls.add(new Student(2, "Java", 40));
     }

     public List<Student> findAll(){
        return ls;
     }


     public Student  save(Student student){
        ls.add(student);

        return student;
     }

     public Student findById(int id){
        return ls.stream().filter(s -> s.getId() == id)
        .findFirst().orElse(null);
     }

     public Student update(int id, Student updated){

        Student student = findById(id);
        if(student != null){

            student.setName(updated.getName());
            student.setAge(updated.getAge());

        }

        return student;
     }

     public boolean delete(int id){
        return ls.removeIf(s-> s.getId()  == id);
     }
    
}
