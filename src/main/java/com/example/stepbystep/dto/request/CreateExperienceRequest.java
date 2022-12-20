package com.example.stepbystep.dto.request;

public class CreateExperienceRequest {

    private String cvId;
    private String companyName;

    public CreateExperienceRequest() {}

    public CreateExperienceRequest(String cvId, String companyName) {
        this.cvId = cvId;
        this.companyName = companyName;
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
}
