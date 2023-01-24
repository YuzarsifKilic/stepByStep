package com.example.stepbystep.dto.request;

public class UpdateJobAdvertisementRequest {

    private int jobTitleId;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;

    public UpdateJobAdvertisementRequest() {}

    public UpdateJobAdvertisementRequest(int jobTitleId, boolean isActive, int minSalary, int maxSalary, int positionCount) {
        this.jobTitleId = jobTitleId;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
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
