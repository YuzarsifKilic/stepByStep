package com.example.stepbystep.dto.model;

import com.example.stepbystep.model.JobTitle;

public class CvExperienceDto {

    private String companyName;
    private int entryYear;
    private int quitYear;
    private JobTitle jobTitle;

    public CvExperienceDto() {}

    public CvExperienceDto(String companyName, int entryYear, int quitYear, JobTitle jobTitle) {
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
}
