package com.cfkvyh.service;

import com.cfkvyh.model.ContactForm;
import com.cfkvyh.model.ContactFormDtoResponse;
import com.cfkvyh.repository.ContactFormRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactFormServiceImpl implements ContactFormService {

    @Autowired
    private ContactFormRepository contactFormRepository;

    @Override
    public ContactFormDtoResponse saveContactForm(ContactForm contactForm) {
        contactForm.setDate(LocalDateTime.now());
        contactFormRepository.save(contactForm);
        return new ContactFormDtoResponse("");
    }
}
