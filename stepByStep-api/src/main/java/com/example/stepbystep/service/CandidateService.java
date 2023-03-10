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

    public CandidateDto getByEmail(final String email) {
        return candidateDtoConverter.convert(findByEmail(email));
    }

    protected Candidate findByEmail(final String email) {
        return candidateRepository.findByEmail(email)
                .orElseThrow(
                        () -> new CandidateNotFoundException(email + " e sahip bir candidate bulunamad─▒"));
    }

    protected Candidate findById(String id) {
        return candidateRepository.findById(id).orElseThrow(
                () -> new CandidateNotFoundException(id + " ye sahip bir candidate bulunamad─▒")
        );
    }

    public CandidateDto save(final CreateCandidateRequest request) {
        Candidate candidate = new Candidate(request.getEmail(),
                request.getPassword(),
                request.getFirstName(),
                request.getLastName(),
                request.getPhoneNumber());
        return candidateDtoConverter.convertForSave(candidateRepository.save(candidate));
    }


    private String checkTheEmailInUse(final Candidate candidate) {
        final boolean result = candidateRepository.findAll().stream().noneMatch(c -> c.getEmail().equals(candidate.getEmail()));
        return result ? checkThePhoneInUse(candidate) : printError(Error.EmailInUse);
    }

    private String checkThePhoneInUse(final Candidate candidate) {
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

            case EmailInUse -> { return "Bu Email Kullan─▒mda"; }
            case PhoneNumberInUse -> { return "Bu Telefon Numaras─▒ Kullan─▒mda"; }
            case Successful -> { return "Kay─▒t ─░┼člemi Ba┼čar─▒l─▒"; }
            default -> { return "Beklenmeyen Bir Hata Olu┼čtu"; }
        }
    }


}
