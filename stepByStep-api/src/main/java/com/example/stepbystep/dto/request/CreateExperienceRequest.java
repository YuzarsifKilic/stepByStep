package com.example.stepbystep.dto.request;

public class CreateExperienceRequest {

    private String cvId;
    private String companyName;
    private int entryYear;
    private int quitYear;
    private int jobTitleId;

    public CreateExperienceRequest() {}

    public CreateExperienceRequest(String cvId, String companyName, int entryYear, int quitYear, int jobTitleId) {
        this.cvId = cvId;
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitleId = jobTitleId;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
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

    public int getJobTitleId() {
        return jobTitleId;
    }

    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
    }
}
