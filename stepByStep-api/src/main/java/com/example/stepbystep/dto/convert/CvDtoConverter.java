package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.CandidateCvDto;
import com.example.stepbystep.dto.model.CvDto;
import com.example.stepbystep.model.Cv;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CvDtoConverter {

    private final ExperienceDtoConverter experienceDtoConverter;

    public CvDtoConverter(ExperienceDtoConverter experienceDtoConverter) {
        this.experienceDtoConverter = experienceDtoConverter;
    }


    public CvDto converter(Cv from) {
        return new CvDto(
                from.getId(),
                from.getEntryOfUniversityYear(),
                from.getGraduatedYear(),
                from.getUniversity(),
                from.getMajor(),
                from.getSkill(),
                from.getExperiences().stream()
                        .map(e -> experienceDtoConverter.convertToCvExperienceDto(e))
                        .collect(Collectors.toSet()));
    }

    public CandidateCvDto convertToCandidateCvDto(Cv from) {
        if (from == null) {
            return new CandidateCvDto("", 0, 0, null, null, null);
        }
        return new CandidateCvDto(
                from.getId(),
                from.getEntryOfUniversityYear(),
                from.getGraduatedYear(),
                from.getUniversity(),
                from.getMajor(),
                from.getExperiences().stream()
                        .map(experienceDtoConverter::convertToCvExperienceDto)
                        .collect(Collectors.toSet())
        );
    }

}
