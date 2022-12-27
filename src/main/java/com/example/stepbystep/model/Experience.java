package com.example.stepbystep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvs"})
public class Experience {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDHexGenerator")
    private String id;
    private String companyName;
    private int entryYear;
    private int quitYear;
    @ManyToOne
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    @JsonManagedReference
    @JoinTable(name = "cv_experience",
                joinColumns = {@JoinColumn(name = "experience_id")},
                inverseJoinColumns = {@JoinColumn(name = "cv_id")})
    private Set<Cv> cvs = new HashSet<>();

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Experience() {}

    public Experience(String companyName, int entryYear, int quitYear, JobTitle jobTitle, Set<Cv> cvs) {
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitle = jobTitle;
        this.cvs = cvs;
    }

    public Experience(String id, String companyName, int entryYear, int quitYear, JobTitle jobTitle, Set<Cv> cvs) {
        this.id = id;
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitle = jobTitle;
        this.cvs = cvs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Cv> getCvs() {
        return cvs;
    }

    public void setCvs(Set<Cv> cvs) {
        this.cvs = cvs;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public int getQuitYear() {
        return quitYear;
    }

    public void setQuitYear(int quitYear) {
        this.quitYear = quitYear;
    }
}
