package com.example.stepbystep.dto.model;

import com.example.stepbystep.model.JobTitle;

public class EmployerJobAdvertisementDto {

    private String id;
    private JobTitle jobTitle;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;

    public EmployerJobAdvertisementDto() {}

    public EmployerJobAdvertisementDto(String id, JobTitle jobTitle, boolean isActive, int minSalary, int maxSalary, int positionCount) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
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

    public String getId() {
        return id;
    }
}
