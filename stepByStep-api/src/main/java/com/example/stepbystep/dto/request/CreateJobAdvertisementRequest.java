package com.example.stepbystep.dto.request;

public class CreateJobAdvertisementRequest {

    private String employerId;
    private int jobTitleId;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;

    public CreateJobAdvertisementRequest() {}

    public CreateJobAdvertisementRequest(String employerId, int jobTitleId, boolean isActive, int minSalary, int maxSalary, int positionCount) {
        this.employerId = employerId;
        this.jobTitleId = jobTitleId;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
    }

    public String getEmployerId() {
        return employerId;
    }

    public int getJobTitleId() {
        return jobTitleId;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public int getPositionCount() {
        return positionCount;
    }
}
