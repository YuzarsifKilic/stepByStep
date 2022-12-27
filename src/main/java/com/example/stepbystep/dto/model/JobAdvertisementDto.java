package com.example.stepbystep.dto.model;

public class JobAdvertisementDto {

    private JobAdvertisementEmployerDto jobAdvertisementEmployerDto;
    private JobTitleDto jobTitleDto;
    private boolean isActive;
    private int minSalary;
    private int maxSalary;
    private int positionCount;

    public JobAdvertisementDto() {}

    public JobAdvertisementDto(JobAdvertisementEmployerDto jobAdvertisementEmployerDto, JobTitleDto jobTitleDto, boolean isActive, int minSalary, int maxSalary, int positionCount) {
        this.jobAdvertisementEmployerDto = jobAdvertisementEmployerDto;
        this.jobTitleDto = jobTitleDto;
        this.isActive = isActive;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.positionCount = positionCount;
    }

    public JobTitleDto getJobTitleDto() {
        return jobTitleDto;
    }

    public void setJobTitleDto(JobTitleDto jobTitleDto) {
        this.jobTitleDto = jobTitleDto;
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
