package com.example.stepbystep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cv {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDHexGenerator")
    private String id;
    private int entryOfUniversityYear;
    private int graduatedYear;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "university_id", nullable = false)
    private University university;
    @ManyToMany(mappedBy = "cvs")
    private Set<Experience> experiences = new HashSet<>();

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Cv() {}

    public Cv(int entryOfUniversityYear, int graduatedYear, University university) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.university = university;
    }

    public Cv(String id, int entryOfUniversityYear, int graduatedYear, University university, Set<Experience> experiences) {
        this.id = id;
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.university = university;
        this.experiences = experiences;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEntryOfUniversityYear() {
        return entryOfUniversityYear;
    }

    public void setEntryOfUniversityYear(int entryOfUniversityYear) {
        this.entryOfUniversityYear = entryOfUniversityYear;
    }

    public int getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(int graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public Set<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }
}
