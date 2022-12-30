package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.CvExperienceDto;
import com.example.stepbystep.dto.model.ExperienceDto;
import com.example.stepbystep.model.Experience;
import org.springframework.stereotype.Component;

@Component
public class ExperienceDtoConverter {


    public ExperienceDtoConverter() {}

    public ExperienceDto convert(Experience from) {
        return new ExperienceDto(
                from.getId(),
                from.getCompanyName(),
                from.getEntryYear(),
                from.getQuitYear(),
                from.getJobTitle());
    }

    public CvExperienceDto convertToCvExperienceDto(Experience from) {
        return new CvExperienceDto(
                from.getCompanyName(),
                from.getEntryYear(),
                from.getQuitYear(),
                from.getJobTitle());
    }
}
