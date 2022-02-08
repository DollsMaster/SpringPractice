package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @RequestMapping("/getPerson")
    public String getPerson (){
        return "ssssss";
    }
}
