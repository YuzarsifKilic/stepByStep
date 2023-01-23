package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.CandidateCvDto;
import com.example.stepbystep.model.Cv;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CandidateCvDtoConverter {

    private final ExperienceDtoConverter experienceDtoConverter;

    public CandidateCvDtoConverter(ExperienceDtoConverter experienceDtoConverter) {
        this.experienceDtoConverter = experienceDtoConverter;
    }

    public CandidateCvDto convert(Cv from) {
        return new CandidateCvDto(
                from.getId(),
                from.getEntryOfUniversityYear(),
            from.getGraduatedYear(),
            from.getUniversity(),
            from.getMajor(),
                from.getExperiences()
                    .stream()
                    .map(e -> experienceDtoConverter.convertToCvExperienceDto(e))
                    .collect(Collectors.toSet()));
    }
}
