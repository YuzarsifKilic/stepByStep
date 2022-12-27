package com.example.stepbystep.dto.model;

public class ExperienceDto {

    private String id;
    private String companyName;
    private int entryYear;
    private int quitYear;
    private JobTitleDto jobTitleDto;

    public ExperienceDto() {}

    public ExperienceDto(String id, String companyName, int entryYear, int quitYear, JobTitleDto jobTitleDto) {
        this.id = id;
        this.companyName = companyName;
        this.entryYear = entryYear;
        this.quitYear = quitYear;
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
