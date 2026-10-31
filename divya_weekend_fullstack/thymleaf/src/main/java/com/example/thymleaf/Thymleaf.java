package com.example.thymleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class Thymleaf {

    @GetMapping ("/welcome")
    public String showWelcomeText(Model model){

        model.addAttribute("Titlemessage", "Hello, spring boot ");
        model.addAttribute("description", "This is form thymleaf model");

        return "text";
       
    }

    @GetMapping("/loop")
    public String showLoop(Model model){

        model.addAttribute("titlemessage", "Course overview");

        List<String> courseList = List.of(
            "Java",
            "Javascript",
            "React",
            "DSA"
        );

        model.addAttribute("courses", courseList);

        return "loop";
    }

    @GetMapping("/object")
    public String showObject(Model model){

        model.addAttribute("titlemessage", "Student profile ");


        Student topStudent = new Student("Divya", "Spring boot");


        model.addAttribute("topstudeent", topStudent);

        return "object";
    }


    @GetMapping("/form")
    public String index(Model model){

        model.addAttribute("title", "User Registration form");
        model.addAttribute("student", new Student());
        return "form";
    }


    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute  Student student){

        ModelAndView mv = new ModelAndView("userdetail");

        mv.addObject("student", student);

        return mv;
    }





}

