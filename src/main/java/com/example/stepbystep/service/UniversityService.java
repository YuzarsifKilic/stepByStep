package com.example.stepbystep.service;

import com.example.stepbystep.exception.UniversityNotFoundException;
import com.example.stepbystep.model.University;
import com.example.stepbystep.repository.UniversityRepository;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    protected University findByUniversityId(int id) {
        return universityRepository.findById(id).orElseThrow(
                () -> new UniversityNotFoundException(id + " ye sahip universite bulunamadı"));
    }


}
