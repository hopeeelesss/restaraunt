package com.example.restaurant.controllers;


import com.example.restaurant.entities.Booking;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookingController {
    @GetMapping()
    public String book(@ModelAttribute("booking") Booking booking){
        return "book";
    }
}
