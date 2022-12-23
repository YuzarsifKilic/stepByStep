package com.example.stepbystep.repository;

import com.example.stepbystep.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, String> {
}
