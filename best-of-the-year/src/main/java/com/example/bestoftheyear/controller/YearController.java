package com.example.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class YearController {
    @GetMapping
    public String year (Model model){
        model.addAttribute("name", "Alessandro");
        model.addAttribute("yearDecided", "2023");

        return "year";
    }
}
