package com.example.stepbystep.repository;

import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployerRepository extends JpaRepository<Employer, String> {

    Optional<Employer> findByEmail(String email);
}
