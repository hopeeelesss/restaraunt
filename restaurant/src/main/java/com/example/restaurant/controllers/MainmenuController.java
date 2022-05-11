package com.example.restaurant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MainmenuController {
    @GetMapping()
    public String contact(){
        return "mainmenu";
    }
}
