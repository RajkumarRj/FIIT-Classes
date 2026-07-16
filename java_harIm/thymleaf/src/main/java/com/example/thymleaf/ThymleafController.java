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
    @GetMapping("/home")
    public String sayHome(Model model){

        model.addAttribute("data", "HelLo java student");

        return "home";
    }

    @GetMapping("/student")
    public String allStudent(Model model){

        List<String> Students = Arrays.asList("Imaya", "harini", "FIIT","Poornima");

        model.addAttribute("student", Students);
     
        return "student";
    }

    @GetMapping("/register")
    public String Register(Model model){

        model.addAttribute("userModel", new User());

        return "register";
    }

    @PostMapping("/save")
    public String resultPage(@ModelAttribute User user, Model model){

        model.addAttribute("data", user);  

        return "result-page";
    }

    @GetMapping("/eligible")
    public String isEligible(Model model){

        model.addAttribute("age", 10);  

        return "eligible";
    }
    
}
