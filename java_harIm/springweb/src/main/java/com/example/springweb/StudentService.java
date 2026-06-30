package com.example.springweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private  List<Student> ls = new ArrayList<>(); 


    public StudentService(){
        ls.add(new Student(1, "FIIT", 23));
        ls.add(new Student(2, "Java", 40));
    }


    public List<Student> getAllStudent(){
        return ls;
    }

}
