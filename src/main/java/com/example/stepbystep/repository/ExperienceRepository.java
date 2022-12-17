package com.example.stepbystep.repository;

import com.example.stepbystep.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, String> {
}
