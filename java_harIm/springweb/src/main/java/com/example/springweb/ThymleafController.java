package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafController {

    @GetMapping("/house")
    public String sayHome(Model model){
        model.addAttribute("Data", "Hello java student");
        return "index";
    }

    
}
