package com.example.test.controller;

import com.example.test.repos.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    TextRepo textRepo;

    @GetMapping
    public String main(Model model) {
        model.addAttribute("textData", textRepo.findAll());
        return "index";
    }
}
