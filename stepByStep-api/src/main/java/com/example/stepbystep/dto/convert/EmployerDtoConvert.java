package com.example.stepbystep.dto.convert;

import com.example.stepbystep.dto.model.EmployerDto;
import com.example.stepbystep.model.Employer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EmployerDtoConvert {

    private final EmployerJobAdvertisementDtoConvert convert;

    public EmployerDtoConvert(EmployerJobAdvertisementDtoConvert convert) {
        this.convert = convert;
    }

    public EmployerDto convert(Employer from) {
        return new EmployerDto(
                from.getId(),
                from.getEmail(),
                from.getCompanyName(),
                from.getWebSite(),
                from.getJobAdvertisements()
                        .stream()
                        .map(j -> convert.convert(j))
                        .collect(Collectors.toSet()));
    }
}
