package com.example.stepbystep.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Major {

    @Id
    @GeneratedValue
    private int id;
    private String majorName;
    @OneToMany(mappedBy = "major", cascade = {CascadeType.ALL})
    private Set<Cv> cvs = new HashSet<>();

    public Major() {}

    public Major(int id, String majorName, Set<Cv> cvs) {
        this.id = id;
        this.majorName = majorName;
        this.cvs = cvs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Set<Cv> getCvs() {
        return cvs;
    }

    public void setCvs(Set<Cv> cvs) {
        this.cvs = cvs;
    }
}
