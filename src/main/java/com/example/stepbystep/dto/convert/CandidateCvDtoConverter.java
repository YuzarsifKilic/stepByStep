package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.CandidateCvDto;
import com.example.stepbystep.model.Cv;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CandidateCvDtoConverter {

    private final UniversityDtoConverter universityDtoConverter;
    private final ExperienceDtoConverter experienceDtoConverter;
    private final MajorDtoConverter majorDtoConverter;

    public CandidateCvDtoConverter(UniversityDtoConverter universityDtoConverter,
                                   ExperienceDtoConverter experienceDtoConverter,
                                   MajorDtoConverter majorDtoConverter) {
        this.universityDtoConverter = universityDtoConverter;
        this.experienceDtoConverter = experienceDtoConverter;
        this.majorDtoConverter = majorDtoConverter;
    }

    public CandidateCvDto convert(Cv from) {
        return new CandidateCvDto(
            from.getEntryOfUniversityYear(),
            from.getGraduatedYear(),
            universityDtoConverter.convert(from.getUniversity()),
            majorDtoConverter.convert(from.getMajor()),
            from.getExperiences()
                    .stream()
                    .map(e -> experienceDtoConverter.convert(e))
                    .collect(Collectors.toSet())
        );
    }
}
