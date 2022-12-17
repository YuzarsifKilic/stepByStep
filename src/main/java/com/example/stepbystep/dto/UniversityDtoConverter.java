package com.example.stepbystep.dto;

import com.example.stepbystep.model.University;
import org.springframework.stereotype.Component;

@Component
public class UniversityDtoConverter {

    public UniversityDto convert(University from) {
        return new UniversityDto(
                from.getId(),
                from.getUniversityName()
        );
    }
}
