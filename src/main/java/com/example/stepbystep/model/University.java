package com.example.stepbystep.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class University {

    @Id
    @GeneratedValue
    private int id;
    private String universityName;
    @OneToMany(mappedBy = "university", cascade = {CascadeType.ALL})
    private Set<Cv> cvs = new HashSet<>();

    public University() {}

    public University(int id, String universityName, Set<Cv> cvs) {
        this.id = id;
        this.universityName = universityName;
        this.cvs = cvs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Set<Cv> getCvs() {
        return cvs;
    }

    public void setCvs(Set<Cv> cvs) {
        this.cvs = cvs;
    }
}
