package com.example.stepbystep.dto.model;

public class JobTitleDto {

    private int id;
    private String jobTitleName;

    public JobTitleDto() {}

    public JobTitleDto(int id, String jobTitleName) {
        this.id = id;
        this.jobTitleName = jobTitleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }
}
