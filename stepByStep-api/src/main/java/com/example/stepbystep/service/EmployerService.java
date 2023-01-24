package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.EmployerDtoConvert;
import com.example.stepbystep.dto.model.EmployerDto;
import com.example.stepbystep.dto.request.CreateEmployerRequest;
import com.example.stepbystep.exception.EmployerNotFoundException;
import com.example.stepbystep.model.Employer;
import com.example.stepbystep.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;
    private final EmployerDtoConvert convert;

    public EmployerService(EmployerRepository employerRepository, EmployerDtoConvert convert) {
        this.employerRepository = employerRepository;
        this.convert = convert;
    }

    public EmployerDto save(CreateEmployerRequest request) {
        Employer employer = new Employer(
                request.getEmail(),
                request.getPassword(),
                request.getCompanyName(),
                request.getWebSite()
        );
        return convert.convert(employerRepository.save(employer));
    }

    protected Employer findById(String id) {
        return employerRepository
                .findById(id)
                .orElseThrow(
                        () -> new EmployerNotFoundException(id + " ye sahip bir Employer bulunamadı"));
    }

    protected Employer findByEmail(String email) {
        return employerRepository
                .findByEmail(email)
                .orElseThrow(
                        () -> new EmployerNotFoundException(email + " e sahip bir Employer bulunamadı"));
    }
}
