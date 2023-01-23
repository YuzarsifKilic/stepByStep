package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.JobAdvertisementDto;
import com.example.stepbystep.model.JobAdvertisement;
import org.springframework.stereotype.Component;

@Component
public class JobAdvertisementDtoConvert {

    public JobAdvertisementDto convert(JobAdvertisement from) {
        return new JobAdvertisementDto(
                from.getId(),
                from.getJobTitle(),
                from.isActive(),
                from.getMinSalary(),
                from.getMaxSalary(),
                from.getPositionCount());
    }

}
