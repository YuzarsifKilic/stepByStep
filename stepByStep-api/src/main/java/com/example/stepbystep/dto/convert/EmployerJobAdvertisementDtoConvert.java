package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.EmployerJobAdvertisementDto;
import com.example.stepbystep.model.JobAdvertisement;

public class EmployerJobAdvertisementDtoConvert {

    public EmployerJobAdvertisementDto convert(JobAdvertisement from) {
        return new EmployerJobAdvertisementDto(
                from.getId(),
                from.getJobTitle(),
                from.isActive(),
                from.getMinSalary(),
                from.getMaxSalary(),
                from.getPositionCount());
    }
}
