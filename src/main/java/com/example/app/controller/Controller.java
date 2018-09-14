package com.example.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/statistics")
    public Object test() {
        System.out.println("hello world");
        return "Done";
    }
}