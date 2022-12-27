package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.JobAdvertisementDto;
import com.example.stepbystep.model.JobAdvertisement;
import org.springframework.stereotype.Component;

@Component
public class JobAdvertisementDtoConvert {

    private final JobAdvertisementEmployerDtoConvert jobAdvertisementEmployerDtoConvert;
    private final JobTitleDtoConverter jobTitleDtoConverter;

    public JobAdvertisementDtoConvert(JobAdvertisementEmployerDtoConvert jobAdvertisementEmployerDtoConvert,
                                      JobTitleDtoConverter jobTitleDtoConverter) {
        this.jobAdvertisementEmployerDtoConvert = jobAdvertisementEmployerDtoConvert;
        this.jobTitleDtoConverter = jobTitleDtoConverter;
    }

}
