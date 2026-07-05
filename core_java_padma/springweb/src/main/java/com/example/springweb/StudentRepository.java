package com.example.springweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {


    private List<StudentModel> students = new ArrayList<>();

    public StudentRepository(){
        students.add(new StudentModel(1, "Padma", 20, "Spring"));
        students.add(new StudentModel(2, "Sahana", 21, "Nodejs"));
    }


    public List<StudentModel> getAllStudent(){

        return students;
    }

    public StudentModel findById(int id){
        return students.stream().filter(s -> s.getId() == id ).findFirst().orElse(null);
    }

    public StudentModel addStudents(StudentModel student){

        students.add(student);

        return student;
    }

    public StudentModel updateStudentRepo(int id, StudentModel updateStudent){

            StudentModel oldStudent = findById(id);

            if(oldStudent != null){
                oldStudent.setName(updateStudent.getName());
                oldStudent.setAge(updateStudent.getAge());
                oldStudent.setCourse(updateStudent.getCourse());
            }
            
            return oldStudent;

    
    }

    public boolean deleteById(int id){
        return students.removeIf(s -> s.getId() == id);
    }

    
   
    
    
}
