package com.example.stepbystep.dto.request;

public class CreateCvRequest {

    private int entryOfUniversityYear;
    private int graduatedYear;
    private int universityId;

    public CreateCvRequest() {}

    public CreateCvRequest(int entryOfUniversityYear, int graduatedYear, int universityId) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.universityId = universityId;
    }

    public int getEntryOfUniversityYear() {
        return entryOfUniversityYear;
    }

    public void setEntryOfUniversityYear(int entryOfUniversityYear) {
        this.entryOfUniversityYear = entryOfUniversityYear;
    }

    public int getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(int graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }
}
