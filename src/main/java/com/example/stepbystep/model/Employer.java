package com.example.stepbystep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Employer extends User{

    private String companyName;
    private String webSite;
    @ManyToMany(mappedBy = "employers")
    private Set<JobAdvertisement> jobAdvertisements;

    public Employer() {}

    public Employer(String companyName, String webSite, Set<JobAdvertisement> jobAdvertisements) {
        this.companyName = companyName;
        this.webSite = webSite;
        this.jobAdvertisements = jobAdvertisements;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Set<JobAdvertisement> getJobAdvertisements() {
        return jobAdvertisements;
    }

    public void setJobAdvertisements(Set<JobAdvertisement> jobAdvertisements) {
        this.jobAdvertisements = jobAdvertisements;
    }
}
