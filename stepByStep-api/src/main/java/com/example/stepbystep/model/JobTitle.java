package com.example.stepbystep.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class JobTitle {

    @Id
    @GeneratedValue
    private int id;
    private String jobTitleName;
    @OneToMany(mappedBy = "jobTitle", cascade = {CascadeType.ALL})
    private Set<Experience> experiences = new HashSet<>();

    public JobTitle() {}

    public JobTitle(int id, String jobTitleName, Set<Experience> experiences) {
        this.id = id;
        this.jobTitleName = jobTitleName;
        this.experiences = experiences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }
}
