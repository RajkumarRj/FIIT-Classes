package com.example.thymleaf;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
}
