package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.model.Candidate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CandidateDtoConverter {

    private final CvDtoConverter converter;

    public CandidateDtoConverter(CvDtoConverter converter) {
        this.converter = converter;
    }


    public CandidateDto convert(Candidate candidate) {
        return new CandidateDto(
                candidate.getId(),
                candidate.getEmail(),
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getTelNo(),
                converter.convertToCandidateCvDto(candidate.getCv())
        );
    }

    public CandidateDto convertForSave(Candidate candidate) {
        return new CandidateDto(
                candidate.getId(),
                candidate.getEmail(),
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getTelNo());
    }


    public List<CandidateDto> convert(List<Candidate> fromList) {
        return fromList.stream().map(from -> new CandidateDto(
                from.getId(),
                from.getEmail(),
                from.getFirstName(),
                from.getLastName(),
                from.getTelNo(),
                converter.convertToCandidateCvDto(from.getCv()))).collect(Collectors.toList());
    }
}
