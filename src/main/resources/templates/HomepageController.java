// package com.example.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/Explore Programs")
    public String home() {
        return "home"; // Loads home.html from src/main/resources/templates
    }
}