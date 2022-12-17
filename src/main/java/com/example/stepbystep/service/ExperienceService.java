package com.example.stepbystep.service;

import com.example.stepbystep.dto.CreateExperienceRequest;
import com.example.stepbystep.model.Cv;
import com.example.stepbystep.model.Experience;
import com.example.stepbystep.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;
    private final CvService cvService;

    public ExperienceService(ExperienceRepository experienceRepository, CvService cvService) {
        this.experienceRepository = experienceRepository;
        this.cvService = cvService;
    }

    public Experience save(CreateExperienceRequest request) {
        Set<Cv> cvs = new HashSet<>();
        cvs.add(cvService.findById(request.getCvId()));

        Experience experience = new Experience(
                request.getCompanyName(),
                cvs
        );

        return experienceRepository.save(experience);
    }
}
