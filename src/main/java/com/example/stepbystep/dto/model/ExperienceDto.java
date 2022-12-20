package com.example.stepbystep.dto.model;

public class ExperienceDto {

    private String id;
    private String companyName;
    private JobTitleDto jobTitleDto;

    public ExperienceDto() {}

    public ExperienceDto(String id, String companyName, JobTitleDto jobTitleDto) {
        this.id = id;
        this.companyName = companyName;
        this.jobTitleDto = jobTitleDto;
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

    public JobTitleDto getJobTitleDto() {
        return jobTitleDto;
    }

    public void setJobTitleDto(JobTitleDto jobTitleDto) {
        this.jobTitleDto = jobTitleDto;
    }
}
