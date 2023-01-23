package com.example.stepbystep.service;

import com.example.stepbystep.dto.request.CreateCvRequest;
import com.example.stepbystep.dto.model.CvDto;
import com.example.stepbystep.dto.convert.CvDtoConverter;
import com.example.stepbystep.dto.request.UpdateCvRequest;
import com.example.stepbystep.exception.CvNotFoundException;
import com.example.stepbystep.model.*;
import com.example.stepbystep.repository.CvRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CvService {

    private final CvRepository cvRepository;
    private final UniversityService universityService;
    private final CandidateService candidateService;
    private final MajorService majorService;
    private final SkillService skillService;
    private final CvDtoConverter converter;

    public CvService(CvRepository cvRepository,
                     UniversityService universityService,
                     CandidateService candidateService,
                     MajorService majorService,
                     SkillService skillService,
                     CvDtoConverter converter) {
        this.cvRepository = cvRepository;
        this.universityService = universityService;
        this.candidateService = candidateService;
        this.majorService = majorService;
        this.skillService = skillService;
        this.converter = converter;
    }

    public List<CvDto> getAll() {
        return cvRepository.findAll().stream().map(cv -> converter.converter(cv)).collect(Collectors.toList());
    }

    public CvDto save(CreateCvRequest request) {
        Cv cv = new Cv(
                candidateService.findById(request.getCandidateId()),
                request.getEntryOfUniversityYear(),
                request.getGraduatedYear(),
                universityService.findByUniversityId(request.getUniversityId()),
                majorService.findById(request.getMajorId()),
                skillService.findById(request.getSkillId()));
        return converter.converter(cvRepository.save(cv));
    }

    public CvDto updateCv(String email, UpdateCvRequest request) {
        Candidate candidate = candidateService.findByEmail(email);
        University university =  universityService.findByUniversityId(request.getUniversityId());
        Major major = majorService.findById(request.getMajorId());
        Skill skill = skillService.findById(request.getSkillId());

        Cv cv = new Cv(
                candidate,
                request.getEntryOfUniversityYear(),
                request.getGraduatedYear(),
                university,
                major,
                skill);

        return converter.converter(cvRepository.save(cv));
    }

    protected Cv findById(String id) {
        return cvRepository.findById(id).orElseThrow(
                () -> new CvNotFoundException(id + "ye sahip bir cv bulunamadı"));
    }
}
