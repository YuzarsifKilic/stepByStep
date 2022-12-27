package com.example.stepbystep.dto.request;

public class CreateCvRequest {

    private String candidateId;
    private int entryOfUniversityYear;
    private int graduatedYear;
    private int universityId;
    private int majorId;

    public CreateCvRequest() {}

    public CreateCvRequest(String candidateId, int entryOfUniversityYear, int graduatedYear, int universityId, int majorId) {
        this.candidateId = candidateId;
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.universityId = universityId;
        this.majorId = majorId;
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

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }
}
