package com.example.stepbystep.service;

import com.example.stepbystep.dto.request.CreateCandidateRequest;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.repository.CandidateRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class CandidateServiceTest {

    private CandidateService candidateService;

    private CandidateRepository candidateRepository;

    @Before
    public void setUp() {
        candidateRepository = Mockito.mock(CandidateRepository.class);

        candidateService = new CandidateService(candidateRepository);
    }

    @Test
    public void whenCreateCandidateWithCalledValidRequest_itShouldReturnCandidate() {
        CreateCandidateRequest createCandidateRequest = new CreateCandidateRequest(
                "yuzarsifkilic@gmail.com",
                "yuzarsif",
                "Yusuf",
                "Kılıç",
                "5554443322");

        Candidate candidate = new Candidate(
                "yuzarsifkilic@gmail.com",
                "yuzarsif",
                "Yusuf",
                "Kılıç",
                "5554443322");

        Mockito.when(candidateRepository.save(candidate)).thenReturn(candidate);

        Candidate result = candidateService.save(createCandidateRequest);

        assertEquals(result, candidate);

        Mockito.verify(candidateRepository).save(candidate);
    }
}