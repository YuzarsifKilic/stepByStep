package com.example.stepbystep.controller;

import com.example.stepbystep.dto.request.CreateExperienceRequest;
import com.example.stepbystep.model.Experience;
import com.example.stepbystep.service.ExperienceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping("/save")
    public ResponseEntity<Experience> save(@RequestBody CreateExperienceRequest request) {
        return ResponseEntity.ok(experienceService.save(request));
    }
}
