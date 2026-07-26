package com.example.thymleaf;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymleafController {
    

    @GetMapping("/hello")
    public String greeting(Model model){
        model.addAttribute("message", "Hello Java students");
        return "welcome";
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        
        List<String> students = Arrays.asList("Arun", "Raj", "padma", "Sahana");

        model.addAttribute("studentList", students);

        return "student-list";
    }

    @GetMapping("/signup")
    public String showForm(){
        return "signup";
    }

    @GetMapping("/greet")
    public String handleForm(String name, Model model) {
        model.addAttribute("greeting", "Hello," +name +"!");
        return "result-page";
    }

    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "register";
    }    

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user , Model model){
        model.addAttribute("data", user);
        return "result";

    }
}
