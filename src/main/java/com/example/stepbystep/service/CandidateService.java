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

    private String checkTheEmailInUse(Candidate candidate) {
        final boolean result = candidateRepository.findAll().stream().noneMatch(c -> c.getEmail().equals(candidate.getEmail()));
        return result ? checkThePhoneInUse(candidate) : printError(Error.EmailInUse);
    }

    private String checkThePhoneInUse(Candidate candidate) {
        final boolean result = candidateRepository.findAll().stream().noneMatch(c -> c.getTelNo().equals(candidate.getTelNo()));
        return result ? printError(Error.Successful) : printError(Error.PhoneNumberInUse);
    }

    enum Error{
        EmailInUse,
        PhoneNumberInUse,
        Successful
    }

    private String printError(Error error) {
        switch (error) {

            case EmailInUse -> { return "Bu Email Kullanımda"; }
            case PhoneNumberInUse -> { return "Bu Telefon Numarası Kullanımda"; }
            case Successful -> { return "Kayıt İşlemi Başarılı"; }
            default -> { return "Beklenmeyen Bir Hata Oluştu"; }
        }
    }


}
