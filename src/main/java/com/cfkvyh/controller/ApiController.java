package com.cfkvyh.controller;

import com.cfkvyh.model.ContactFormDtoResponse;
import com.cfkvyh.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cfkvyh.model.ContactForm;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ContactFormService contactFormService;

    @GetMapping("/about")
    public String about() {
        System.out.println("TEST");
        return "{\"message\": \"This is the about page\"}";
    }

    @PostMapping("/contact")
    public ContactFormDtoResponse submitContactForm(@RequestBody ContactForm contactForm) {
        return contactFormService.saveContactForm(contactForm);
    }
}
