package com.example.stepbystep.dto;

import com.example.stepbystep.model.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CandidateDtoConverter {

    private final CvDtoConverter converter;

    public CandidateDtoConverter(CvDtoConverter converter) {
        this.converter = converter;
    }

    public CandidateDto convert(Candidate candidate) {
        return new CandidateDto(
                candidate.getEmail(),
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getTelNo(),
                converter.converter(candidate.getCv())
        );
    }
}
