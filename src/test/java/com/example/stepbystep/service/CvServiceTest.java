package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.CvDtoConverter;
import com.example.stepbystep.dto.model.CvDto;
import com.example.stepbystep.dto.request.CreateCvRequest;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.model.Cv;
import com.example.stepbystep.model.Major;
import com.example.stepbystep.model.University;
import com.example.stepbystep.repository.CvRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CvServiceTest {

    private CvService cvService;

    private CvRepository cvRepository;
    private UniversityService universityService;
    private CandidateService candidateService;
    private MajorService majorService;
    private SkillService skillService;
    private CvDtoConverter converter;

    @BeforeEach
    void setUp() {
        cvRepository = Mockito.mock(CvRepository.class);
        universityService = Mockito.mock(UniversityService.class);
        candidateService = Mockito.mock(CandidateService.class);
        majorService = Mockito.mock(MajorService.class);
        skillService = Mockito.mock(SkillService.class);
        converter = Mockito.mock(CvDtoConverter.class);

        cvService = new CvService(cvRepository, universityService, candidateService, majorService, skillService, converter);
    }

    /*
    @Test
    public void whenCreateCvCalledWithValidRequest_itShouldReturnValidCvDto() {
        CreateCvRequest createCvRequest = new CreateCvRequest("1234", 2018, 2022, 1, 1);

        Candidate candidate = new Candidate("1234", "yuzarsifkilic@gmail.com", "yuzarsif", "Yusuf", "Kılıç", "5554443322");
        University university = new University(1, "Beykoz Üniversitesi");
        Major major = new Major(1, "Yazılım Mühendisliği");

        Cv cv = new Cv("123456", candidate, 2018, 2022, university, major);
        CvDto cvDto = new CvDto("123456", 2018, 2022, )

        Mockito.when(candidateService.findById("1234")).thenReturn(candidate);
        Mockito.when(universityService.findByUniversityId(1)).thenReturn(university);
        Mockito.when(majorService.findById(1)).thenReturn(major);

        Mockito.when(cvRepository.save(cv)).thenReturn(cv);

        Mockito.when(converter.converter(cv)).thenReturn()
    }

     */
}