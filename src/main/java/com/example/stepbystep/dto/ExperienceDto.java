package com.example.stepbystep.dto;

public class ExperienceDto {

    private String id;
    private String companyName;

    public ExperienceDto() {}

    public ExperienceDto(String id, String companyName) {
        this.id = id;
        this.companyName = companyName;
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
}
