package com.example.stepbystep.repository;

import com.example.stepbystep.model.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, String> {
}
