package com.example.stepbystep.service;

import com.example.stepbystep.dto.convert.JobAdvertisementDtoConvert;
import com.example.stepbystep.dto.model.JobAdvertisementDto;
import com.example.stepbystep.dto.request.CreateEmployerRequest;
import com.example.stepbystep.dto.request.CreateJobAdvertisementRequest;
import com.example.stepbystep.dto.request.UpdateJobAdvertisementRequest;
import com.example.stepbystep.exception.JobAdvertisementNotFoundException;
import com.example.stepbystep.model.Employer;
import com.example.stepbystep.model.JobAdvertisement;
import com.example.stepbystep.model.JobTitle;
import com.example.stepbystep.repository.JobAdvertisementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAdvertisementService {

    private final JobAdvertisementRepository jobAdvertisementRepository;
    private final JobAdvertisementDtoConvert jobAdvertisementDtoConvert;
    private final JobTitleService jobTitleService;
    private final EmployerService employerService;

    public JobAdvertisementService(JobAdvertisementRepository jobAdvertisementRepository,
                                   JobAdvertisementDtoConvert jobAdvertisementDtoConvert,
                                   JobTitleService jobTitleService,
                                   EmployerService employerService) {
        this.jobAdvertisementRepository = jobAdvertisementRepository;
        this.jobAdvertisementDtoConvert = jobAdvertisementDtoConvert;
        this.jobTitleService = jobTitleService;
        this.employerService = employerService;
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

    public JobAdvertisementDto save(CreateJobAdvertisementRequest request) {
        Employer employer = employerService.findById(request.getEmployerId());
        JobTitle jobTitle = jobTitleService.findById(request.getJobTitleId());

        JobAdvertisement jobAdvertisement = new JobAdvertisement(
                jobTitle,
                request.isActive(),
                request.getMinSalary(),
                request.getMaxSalary(),
                request.getPositionCount(),
                employer);

        return jobAdvertisementDtoConvert.convert(jobAdvertisementRepository.save(jobAdvertisement));
    }

    public JobAdvertisementDto update(String email, UpdateJobAdvertisementRequest request) {
        Employer employer = employerService.findByEmail(email);
        JobTitle jobTitle = jobTitleService.findById(request.getJobTitleId());

        JobAdvertisement jobAdvertisement = new JobAdvertisement(
                jobTitle,
                request.isActive(),
                request.getMinSalary(),
                request.getMaxSalary(),
                request.getPositionCount(),
                employer);

        return jobAdvertisementDtoConvert.convert(jobAdvertisementRepository.save(jobAdvertisement));
    }
}
