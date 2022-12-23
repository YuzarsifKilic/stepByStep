package com.example.stepbystep.service;

import com.example.stepbystep.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;

    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }
}
