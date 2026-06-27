package com.example.SpringWeb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();


    public StudentService(){
        students.add(new Student(1, "FIIT", 90));
        students.add(new Student(2, "REDMI", 92));

    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }


    public Student getStudentByid(int id){

        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }

        return null;
    }






    
}
