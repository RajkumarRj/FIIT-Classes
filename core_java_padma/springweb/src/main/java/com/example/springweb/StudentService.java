package com.example.springweb;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    // @Autowired
    StudentRepository repo;

    public StudentService(StudentRepository repo){
        this.repo = repo;
    }

    public List<StudentModel> getStudent(){

        return repo.getAllStudent();
    }

    public StudentModel addStudent(StudentModel student){

        return repo.addStudents(student);

    }

    public StudentModel updateStudent(int id, StudentModel student){

        return repo.updateStudentRepo(id, student);
    }
    
    public boolean deleteStudent(int id){

        return repo.deleteById(id);


    }

    public StudentModel getStudentById(int id){
        return repo.findById(id);
    }
}
