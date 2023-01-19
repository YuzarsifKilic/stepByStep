package com.example.stepbystep.model;

import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class Skill {

    private int id;
    private String skillName;
    @OneToMany()
    private Set<Cv> cvs = new HashSet<>();
}
