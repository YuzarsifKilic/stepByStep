package com.example.stepbystep.service;

import com.example.stepbystep.repository.JobAdvertisementRepository;
import org.springframework.stereotype.Service;

@Service
public class JobAdvertisementService {

    private final JobAdvertisementRepository jobAdvertisementRepository;

    public JobAdvertisementService(JobAdvertisementRepository jobAdvertisementRepository) {
        this.jobAdvertisementRepository = jobAdvertisementRepository;
    }
}
