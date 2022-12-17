package com.example.stepbystep.controller;

import com.example.stepbystep.dto.CreateCvRequest;
import com.example.stepbystep.dto.CvDto;
import com.example.stepbystep.model.Cv;
import com.example.stepbystep.service.CvService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvService cvService;

    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("/getall")
    public List<CvDto> getAll() {
        return cvService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<CvDto> save(@RequestBody CreateCvRequest request) {
        return ResponseEntity.ok(cvService.save(request));
    }
}
