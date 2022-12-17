package com.example.stepbystep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class JobTitle {

    @Id
    @GeneratedValue
    private int id;
    private String jobTitleName;

    public JobTitle() {}

    public JobTitle(int id, String jobTitleName) {
        this.id = id;
        this.jobTitleName = jobTitleName;
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
