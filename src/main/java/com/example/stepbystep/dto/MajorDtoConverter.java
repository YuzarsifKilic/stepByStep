package com.example.stepbystep.dto;

import com.example.stepbystep.model.Major;
import org.springframework.stereotype.Component;

@Component
public class MajorDtoConverter {

    public MajorDto convert(Major from) {
        return new MajorDto(
                from.getId(),
                from.getMajorName());
    }
}
