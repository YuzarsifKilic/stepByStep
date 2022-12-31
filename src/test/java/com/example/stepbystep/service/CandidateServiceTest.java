package com.example.stepbystep.service;

import com.example.stepbystep.TestSupport;
import com.example.stepbystep.dto.convert.CandidateDtoConverter;
import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.dto.request.CreateCandidateRequest;
import com.example.stepbystep.exception.CandidateNotFoundException;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.repository.CandidateRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CandidateServiceTest extends TestSupport {

    private CandidateService candidateService;

    private CandidateRepository candidateRepository;
    private CandidateDtoConverter candidateDtoConverter;

    @Before
    public void setUp() {
        candidateRepository = Mockito.mock(CandidateRepository.class);
        candidateDtoConverter = Mockito.mock(CandidateDtoConverter.class);

        candidateService = new CandidateService(candidateRepository, candidateDtoConverter);
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

        when(candidateRepository.save(candidate)).thenReturn(candidate);

        Candidate result = candidateService.save(createCandidateRequest);

        assertEquals(result, candidate);

        verify(candidateRepository).save(candidate);
    }

    @Test
    public void testGetAllCandidates_itShouldReturnCandidateDtoList() {
        List<Candidate> candidateList = generateCandidates();
        List<CandidateDto> candidateDtoList = generateCandidateDtoList(candidateList);

        when(candidateRepository.findAll()).thenReturn(candidateList);
        when(candidateDtoConverter.convert(candidateList)).thenReturn(candidateDtoList);

        List<CandidateDto> result = candidateService.getAll();

        assertEquals(candidateDtoList, result);
        verify(candidateRepository).findAll();
        verify(candidateDtoConverter).convert(candidateList);
    }

    @Test
    public void testGetByCandidateEmail_whenCandidateEmailExist_itShouldReturnCandidateDto() {
        String email = "yuzarsifkilic@gmail.com";
        Candidate candidate = generateCandidate(email);
        CandidateDto candidateDto = generateCandidateDto(email);

        when(candidateRepository.findByEmail(email)).thenReturn(Optional.of(candidate));
        when(candidateDtoConverter.convert(candidate)).thenReturn(candidateDto);

        CandidateDto result = candidateService.getByEmail(email);

        assertEquals(candidateDto, result);
        verify(candidateRepository).findByEmail(email);
        verify(candidateDtoConverter).convert(candidate);
    }

    @Test
    public void testGetByCandidateEmail_whenCandidateEmailDoesNotExist_itShouldThrowCandidateNotFoundException() {
        String email = "yuzarsifkilic@gmail.com";

        when(candidateRepository.findByEmail(email)).thenReturn(Optional.empty());

        assertThrows(CandidateNotFoundException.class,
                () -> candidateService.getByEmail(email));

        verify(candidateRepository).findByEmail(email);
        verifyNoInteractions(candidateDtoConverter);
    }
}