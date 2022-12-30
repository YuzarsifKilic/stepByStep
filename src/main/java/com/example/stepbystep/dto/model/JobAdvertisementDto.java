package com.example.stepbystep.dto.model;

import com.example.stepbystep.model.JobTitle;

public class JobAdvertisementDto {

    private JobAdvertisementEmployerDto jobAdvertisementEmployerDto;
    private JobTitle jobTitle;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;

    public JobAdvertisementDto() {}

    public JobAdvertisementDto(JobAdvertisementEmployerDto jobAdvertisementEmployerDto,
                               JobTitle jobTitle,
                               boolean isActive,
                               int minSalary,
                               int maxSalary,
                               int positionCount) {
        this.jobAdvertisementEmployerDto = jobAdvertisementEmployerDto;
        this.jobTitle = jobTitle;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
    }

    public JobTitle getJobTitleDto() {
        return jobTitle;
    }

    public void setJobTitleDto(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    public JobAdvertisementEmployerDto getJobAdvertisementEmployerDto() {
        return jobAdvertisementEmployerDto;
    }

    public void setJobAdvertisementEmployerDto(JobAdvertisementEmployerDto jobAdvertisementEmployerDto) {
        this.jobAdvertisementEmployerDto = jobAdvertisementEmployerDto;
    }
}
