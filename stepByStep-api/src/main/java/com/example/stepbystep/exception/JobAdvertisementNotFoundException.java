package com.example.stepbystep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JobAdvertisementNotFoundException extends RuntimeException {

    public JobAdvertisementNotFoundException(String message) {
        super(message);
    }
}
