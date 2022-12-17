package com.example.stepbystep.dto;

import com.example.stepbystep.model.Experience;
import org.springframework.stereotype.Component;

@Component
public class ExperienceDtoConverter {

    private final JobTitleDtoConverter converter;

    public ExperienceDtoConverter(JobTitleDtoConverter converter) {
        this.converter = converter;
    }

    public ExperienceDto convert(Experience from) {
        return new ExperienceDto(
                from.getId(),
                from.getCompanyName(),
                converter.convert(from.getJobTitle()));
    }
}
