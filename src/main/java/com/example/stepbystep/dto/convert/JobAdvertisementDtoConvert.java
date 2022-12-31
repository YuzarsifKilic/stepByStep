package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.JobAdvertisementDto;
import com.example.stepbystep.model.JobAdvertisement;
import org.springframework.stereotype.Component;

@Component
public class JobAdvertisementDtoConvert {

    private final JobAdvertisementEmployerDtoConvert jobAdvertisementEmployerDtoConvert;

    public JobAdvertisementDtoConvert(JobAdvertisementEmployerDtoConvert jobAdvertisementEmployerDtoConvert) {
        this.jobAdvertisementEmployerDtoConvert = jobAdvertisementEmployerDtoConvert;
    }

}
