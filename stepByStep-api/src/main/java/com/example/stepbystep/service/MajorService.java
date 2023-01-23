package com.example.stepbystep.service;

import com.example.stepbystep.exception.MajorNotFoundException;
import com.example.stepbystep.model.Major;
import com.example.stepbystep.repository.MajorRepository;
import org.springframework.stereotype.Service;

@Service
public class MajorService {

    private final MajorRepository majorRepository;

    public MajorService(MajorRepository majorRepository) {
        this.majorRepository = majorRepository;
    }

    protected Major findById(int id) {
        return majorRepository.findById(id).orElseThrow(
                () -> new MajorNotFoundException(id + " ye sahip bir major bulunamadı"));
    }
}
