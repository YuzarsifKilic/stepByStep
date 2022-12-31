package com.example.stepbystep.dto.request;

public class UpdateCvRequest {

    private int entryOfUniversityYear;
    private int graduatedYear;
    private int universityId;
    private int majorId;

    public UpdateCvRequest() {}

    public UpdateCvRequest(int entryOfUniversityYear, int graduatedYear, int universityId, int majorId) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.universityId = universityId;
        this.majorId = majorId;
    }

    public int getEntryOfUniversityYear() {
        return entryOfUniversityYear;
    }

    public int getGraduatedYear() {
        return graduatedYear;
    }

    public int getUniversityId() {
        return universityId;
    }

    public int getMajorId() {
        return majorId;
    }
}
