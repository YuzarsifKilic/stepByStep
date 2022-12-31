package com.example.stepbystep.controller;

import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.dto.request.CreateCandidateRequest;
import com.example.stepbystep.model.Candidate;
import com.example.stepbystep.service.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public List<CandidateDto> getAll() {
        return candidateService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Candidate> save(@RequestBody CreateCandidateRequest request) {
        return ResponseEntity.ok(candidateService.save(request));
    }
}
