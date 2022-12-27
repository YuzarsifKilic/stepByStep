package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.JobAdvertisementEmployerDto;
import com.example.stepbystep.model.Employer;
import org.springframework.stereotype.Component;

@Component
public class JobAdvertisementEmployerDtoConvert {

    public JobAdvertisementEmployerDto convert(Employer from) {
        return new JobAdvertisementEmployerDto(
                from.getEmail(),
                from.getCompanyName(),
                from.getWebSite()
        );
    }
}
