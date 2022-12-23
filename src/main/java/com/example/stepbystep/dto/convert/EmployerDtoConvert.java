package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.EmployerDto;
import com.example.stepbystep.model.Employer;
import org.springframework.stereotype.Component;

@Component
public class EmployerDtoConvert {

    public EmployerDto convert(Employer from) {
        return new EmployerDto(
                from.getId()
                from.getEmail(),
                from.getCompanyName(),
                from.getWebSite()
        );
    }
}
