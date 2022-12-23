package com.example.stepbystep.service;

import com.example.stepbystep.exception.JobTitleNotFoundException;
import com.example.stepbystep.model.JobTitle;
import com.example.stepbystep.repository.JobTitleRepository;
import org.springframework.stereotype.Service;

@Service
public class JobTitleService {

    private final JobTitleRepository jobTitleRepository;

    public JobTitleService(JobTitleRepository jobTitleRepository) {
        this.jobTitleRepository = jobTitleRepository;
    }

    protected JobTitle findById(int id) {
        return jobTitleRepository.findById(id).orElseThrow(
                () -> new JobTitleNotFoundException(id + " ye sahip JobTitle bulunamadı")
        );
    }
}
