package com.example.stepbystep.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity
public class JobAdvertisement {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDHexGenerator")
    private String id;
    @ManyToOne
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    @JsonManagedReference
    @JoinTable(name = "employer_job_advertisements",
            joinColumns = {@JoinColumn(name = "job_advertisement_id")},
            inverseJoinColumns = {@JoinColumn(name = "employer_id")})
    private Set<Employer> employers;

    public JobAdvertisement() {}

    public JobAdvertisement(String id, JobTitle jobTitle, boolean isActive, int minSalary, int maxSalary, int positionCount, Set<Employer> employers) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
        this.employers = employers;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
