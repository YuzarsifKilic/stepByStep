package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.CandidateDtoConverter;
import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.dto.request.CreateCandidateRequest;
import com.example.stepbystep.exception.CandidateNotFoundException;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;
    private final CandidateDtoConverter candidateDtoConverter;

    public CandidateService(CandidateRepository candidateRepository,
                            CandidateDtoConverter candidateDtoConverter) {
        this.candidateRepository = candidateRepository;
        this.candidateDtoConverter = candidateDtoConverter;
    }

    public List<CandidateDto> getAll() {
        return candidateDtoConverter.convert(candidateRepository.findAll());
    }

    public CandidateDto getByEmail(String email) {
        return candidateDtoConverter.convert(findByEmail(email));
    }

    private Candidate findByEmail(String email) {
        return candidateRepository.findByEmail(email)
                .orElseThrow(
                        () -> new CandidateNotFoundException(email + " e sahip bir candidate bulunamadı"));
    }

    protected Candidate findById(String id) {
        return candidateRepository.findById(id).orElseThrow(
                () -> new CandidateNotFoundException(id + " ye sahip bir candidate bulunamadı")
        );
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
