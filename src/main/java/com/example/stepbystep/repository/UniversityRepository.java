package com.example.stepbystep.repository;

import com.example.stepbystep.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Integer> {
}
