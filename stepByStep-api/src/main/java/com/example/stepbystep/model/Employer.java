package com.example.stepbystep.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Employer extends User{

    private String companyName;
    private String webSite;
    @OneToMany(mappedBy = "employer", cascade = {CascadeType.ALL})
    private Set<JobAdvertisement> jobAdvertisements;

    public Employer() {}

    public Employer(String email, String password, String companyName, String webSite, Set<JobAdvertisement> jobAdvertisements) {
        super(email, password);
        this.companyName = companyName;
        this.webSite = webSite;
        this.jobAdvertisements = jobAdvertisements;
    }

    public Employer(String email, String password, String companyName, String webSite) {
        super(email, password);
        this.companyName = companyName;
        this.webSite = webSite;
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
