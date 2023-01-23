package com.example.stepbystep.dto.request;

public class UpdateExperienceRequest {

    private String companyName;
    private int entryYear;
    private int quitYear;
    private int jobTitleId;

    public UpdateExperienceRequest() {}

    public UpdateExperienceRequest(String companyName, int entryYear, int quitYear, int jobTitleId) {
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
        this.jobTitleId = jobTitleId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public int getQuitYear() {
        return quitYear;
    }

    public int getJobTitleId() {
        return jobTitleId;
    }
}
