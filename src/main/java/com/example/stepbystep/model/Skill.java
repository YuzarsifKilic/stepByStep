package com.example.stepbystep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Skill {

    @Id
    @GeneratedValue
    private int id;
    private String skillName;
    @OneToMany()
    private Set<Cv> cvs = new HashSet<>();
}
