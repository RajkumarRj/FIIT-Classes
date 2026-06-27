package com.example.SpringWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @GetMapping("/")
    public String sayTeacher(){
        return "HEllo teacher";
    }



    
}
