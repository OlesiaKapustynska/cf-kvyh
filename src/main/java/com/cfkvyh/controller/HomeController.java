package com.cfkvyh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @GetMapping("/")
//    public String home() {
//        return "index";
//    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
