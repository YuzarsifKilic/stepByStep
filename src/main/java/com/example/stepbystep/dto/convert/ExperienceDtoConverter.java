package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.ExperienceDto;
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
                from.getEntryYear(),
                from.getQuitYear(),
                converter.convert(from.getJobTitle()));
    }
}
