package com.example.stepbystep.dto;

import com.example.stepbystep.model.Cv;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CvDtoConverter {

    private final UniversityDtoConverter universityDtoConverter;
    private final ExperienceDtoConverter experienceDtoConverter;

    public CvDtoConverter(UniversityDtoConverter universityDtoConverter, ExperienceDtoConverter experienceDtoConverter) {
        this.universityDtoConverter = universityDtoConverter;
        this.experienceDtoConverter = experienceDtoConverter;
    }

    public CvDto converter(Cv from) {
        return new CvDto(
                from.getEntryOfUniversityYear(),
                from.getGraduatedYear(),
                universityDtoConverter.convert(from.getUniversity()),
                from.getExperiences().stream().map(e -> experienceDtoConverter.convert(e)).collect(Collectors.toSet())
        );
    }
}
