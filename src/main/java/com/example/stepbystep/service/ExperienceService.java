package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.ExperienceDtoConverter;
import com.example.stepbystep.dto.model.ExperienceDto;
import com.example.stepbystep.dto.request.CreateExperienceRequest;
import com.example.stepbystep.dto.request.UpdateExperienceRequest;
import com.example.stepbystep.model.Cv;
import com.example.stepbystep.model.Experience;
import com.example.stepbystep.model.JobTitle;
import com.example.stepbystep.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;
    private final CvService cvService;
    private final JobTitleService jobTitleService;
    private final ExperienceDtoConverter converter;

    public ExperienceService(ExperienceRepository experienceRepository,
                             CvService cvService,
                             JobTitleService jobTitleService,
                             ExperienceDtoConverter converter) {
        this.experienceRepository = experienceRepository;
        this.cvService = cvService;
        this.jobTitleService = jobTitleService;
        this.converter = converter;
    }

    public ExperienceDto save(CreateExperienceRequest request) {
        Set<Cv> cvs = new HashSet<>();
        cvs.add(cvService.findById(request.getCvId()));

        Experience experience = new Experience(
                request.getCompanyName(),
                request.getEntryYear(),
                request.getQuitYear(),
                jobTitleService.findById(request.getJobTitleId()),
                cvs
        );

        return converter.convert(experienceRepository.save(experience));
    }

    public ExperienceDto updateExperience(String cvId, UpdateExperienceRequest request) {
        Set<Cv> cvs = new HashSet<>();
        Cv cv = cvService.findById(cvId);
        cvs.add(cv);
        JobTitle jobTitle = jobTitleService.findById(request.getJobTitleId());

        Experience experience = new Experience(
                request.getCompanyName(),
                request.getEntryYear(),
                request.getQuitYear(),
                jobTitle,
                cvs);

        return converter.convert(experienceRepository.save(experience));
    }
}
