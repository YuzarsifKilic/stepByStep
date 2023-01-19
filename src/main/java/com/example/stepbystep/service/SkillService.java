package com.example.stepbystep.service;

import com.example.stepbystep.exception.SkillNotFoundException;
import com.example.stepbystep.model.Skill;
import com.example.stepbystep.repository.SkillRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    protected Skill findById(int id) {
        return skillRepository.findById(id).orElseThrow(
                () -> new SkillNotFoundException(id + " ye sahip bir skill bulunamadı")
        );
    }
}
