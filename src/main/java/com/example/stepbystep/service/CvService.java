package com.example.stepbystep.service;

import com.example.stepbystep.dto.CreateCvRequest;
import com.example.stepbystep.dto.CvDto;
import com.example.stepbystep.dto.CvDtoConverter;
import com.example.stepbystep.exception.CvNotFoundException;
import com.example.stepbystep.model.Cv;
import com.example.stepbystep.repository.CvRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CvService {

    private final CvRepository cvRepository;
    private final UniversityService universityService;
    private final CvDtoConverter converter;

    public CvService(CvRepository cvRepository, UniversityService universityService, CvDtoConverter converter) {
        this.cvRepository = cvRepository;
        this.universityService = universityService;
        this.converter = converter;
    }

    public List<CvDto> getAll() {
        return cvRepository.findAll().stream().map(cv -> converter.converter(cv)).collect(Collectors.toList());
    }

    public CvDto save(CreateCvRequest request) {
        Cv cv = new Cv(
                request.getEntryOfUniversityYear(),
                request.getGraduatedYear(),
                universityService.findByUniversityId(request.getUniversityId())
        );
        return converter.converter(cvRepository.save(cv));
    }

    public Cv findById(String id) {
        return cvRepository.findById(id).orElseThrow(
                () -> new CvNotFoundException(id + "ye sahip bir cv bulunamadı"));
    }
}
