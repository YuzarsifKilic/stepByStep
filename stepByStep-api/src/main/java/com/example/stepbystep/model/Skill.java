package com.example.stepbystep.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Skill {

    @Id
    @GeneratedValue
    private int id;
    private String skillName;
    @OneToMany(mappedBy = "skill", cascade = {CascadeType.ALL})
    private Set<Cv> cvs = new HashSet<>();
}
