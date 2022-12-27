package com.example.stepbystep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MajorNotFoundException extends RuntimeException{

    public MajorNotFoundException(String message) {
        super(message);
    }
}
