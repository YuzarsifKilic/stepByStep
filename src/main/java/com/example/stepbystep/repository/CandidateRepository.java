package com.example.stepbystep.repository;

import com.example.stepbystep.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, String> {
}
