package com.example.test.controller;

import com.example.test.domain.Text;
import com.example.test.service.text.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("text")
public class TextController {

    @Autowired
    TextService textService;

    @GetMapping
    public List<Text> list() {
        return textService.getAll();
    }

    @PostMapping
    public Text create(@RequestBody Text text) {
        return textService.addText(text);
    }
}
