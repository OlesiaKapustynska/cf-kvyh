package com.cfkvyh.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ContactFormDtoResponse {
    private String message;

    public ContactFormDtoResponse(String s) {
    }
}
