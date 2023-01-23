package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.JobAdvertisementDtoConvert;
import com.example.stepbystep.dto.model.JobAdvertisementDto;
import com.example.stepbystep.exception.JobAdvertisementNotFoundException;
import com.example.stepbystep.repository.JobAdvertisementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAdvertisementService {

    private final JobAdvertisementRepository jobAdvertisementRepository;
    private final JobAdvertisementDtoConvert jobAdvertisementDtoConvert;
    private final JobTitleService jobTitleService;

    public JobAdvertisementService(JobAdvertisementRepository jobAdvertisementRepository,
                                   JobAdvertisementDtoConvert jobAdvertisementDtoConvert,
                                   JobTitleService jobTitleService) {
        this.jobAdvertisementRepository = jobAdvertisementRepository;
        this.jobAdvertisementDtoConvert = jobAdvertisementDtoConvert;
        this.jobTitleService = jobTitleService;
    }

    public List<JobAdvertisementDto> getAll() {
        return jobAdvertisementRepository
                .findAll()
                .stream()
                .map(j -> jobAdvertisementDtoConvert.convert(j))
                .collect(Collectors.toList());
    }

    public List<JobAdvertisementDto> getByJobTitle(int jobTitleId) {
        return jobAdvertisementRepository
                .findAll()
                .stream()
                .filter(j -> j.getJobTitle().getId() == jobTitleId)
                .map(ja -> jobAdvertisementDtoConvert.convert(ja))
                .collect(Collectors.toList());
    }

    public List<JobAdvertisementDto> getActiveAllJobAdvertisements() {
        return jobAdvertisementRepository
                .findAll()
                .stream()
                .filter(j -> j.isActive())
                .map(ja -> jobAdvertisementDtoConvert.convert(ja))
                .collect(Collectors.toList());
    }

    public JobAdvertisementDto getJobAdvertisement(String id) {
        return jobAdvertisementDtoConvert
                .convert(jobAdvertisementRepository
                        .findById(id)
                        .orElseThrow(
                                () -> new JobAdvertisementNotFoundException(id + " ye sahip bir kullanıcı bulunamadı")));
    }
}
