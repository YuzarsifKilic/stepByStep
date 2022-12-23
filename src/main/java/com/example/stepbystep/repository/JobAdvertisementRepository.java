package com.example.stepbystep.repository;

import com.example.stepbystep.model.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertisementRepository extends JpaRepository<JobAdvertisement, String> {
}
