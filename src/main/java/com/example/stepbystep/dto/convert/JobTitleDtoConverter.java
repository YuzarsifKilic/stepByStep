package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.JobTitleDto;
import com.example.stepbystep.model.JobTitle;
import org.springframework.stereotype.Component;

@Component
public class JobTitleDtoConverter {

    public JobTitleDto convert(JobTitle from) {
        return new JobTitleDto(
                from.getId(),
                from.getJobTitleName());
    }
}
