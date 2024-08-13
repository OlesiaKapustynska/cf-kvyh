package com.cfkvyh.service;

import com.cfkvyh.model.ContactForm;
import com.cfkvyh.model.ContactFormDtoResponse;

public interface ContactFormService {
    ContactFormDtoResponse saveContactForm(ContactForm contactForm);
}
