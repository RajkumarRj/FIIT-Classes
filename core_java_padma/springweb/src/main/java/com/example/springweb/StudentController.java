package com.example.springweb;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }


    @GetMapping("/list")
    public List<StudentModel> sayList(){
        return service.getStudent();
    }

    @GetMapping("/list/{id}")
    public StudentModel getStudent(@PathVariable int id){

        return service.getStudentById(id);
    }



    @PostMapping("/add")
    public StudentModel addStudent(@RequestBody StudentModel student ){

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());

        return service.addStudent(student);

    }

    // put method

    @PutMapping("/update/{id}")
    public StudentModel update(@PathVariable int id ,@RequestBody StudentModel student ){

        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id ){
        return service.deleteStudent(id) ? "Deleted Successfully":"Data not found";
    }

}
