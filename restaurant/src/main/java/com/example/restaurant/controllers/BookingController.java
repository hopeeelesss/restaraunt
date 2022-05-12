package com.example.restaurant.controllers;


import com.example.restaurant.entities.Booking;
import com.example.restaurant.repos.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;


@Controller
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingRepository bookingRepo;

    @ModelAttribute("booking")
    public Booking booking() {
        return new Booking();
    }


    @GetMapping
    public String showForm(){
        return "booking";
    }

    @PostMapping
    public String setBooking(@ModelAttribute("booking") Booking booking){
        Date date = new Date(System.currentTimeMillis());
        List<Booking> todaybooking = bookingRepo.findAllByDate(date);
        if(todaybooking.size() > 10){
            return "redirect:/booking/denied";
        }
        else{
            bookingRepo.save(booking);
            return "redirect:/booking/confirmed";
        }
    }

    @GetMapping("/confirmed")
    public String bookingConfirmed(){
        return "confirmed";
    }

    @GetMapping("/denied")
    public String bookingDenied(){
        return "denied";
    }


}
