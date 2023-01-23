package com.example.stepbystep.dto.model;

import com.example.stepbystep.model.JobTitle;

public class ExperienceDto {

    private String id;
    private String companyName;
    private int entryYear;
    private int quitYear;
    private JobTitle jobTitle;

    public ExperienceDto() {}

    public ExperienceDto(String id, String companyName, int entryYear, int quitYear, JobTitle jobTitle) {
        this.id = id;
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitle = jobTitle;
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

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
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
