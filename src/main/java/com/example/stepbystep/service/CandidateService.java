package com.example.stepbystep.service;

import com.example.stepbystep.dto.request.CreateCandidateRequest;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    public Candidate save(CreateCandidateRequest request) {
        Candidate candidate = new Candidate(request.getEmail(),
                request.getPassword(),
                request.getFirstName(),
                request.getLastName(),
                request.getPhoneNumber());
        return candidateRepository.save(candidate);
    }

    private boolean checkTheEmailInUse(String email) {
        return candidateRepository.findAll().stream().anyMatch(c -> c.getEmail().equals(email));
    }
}
