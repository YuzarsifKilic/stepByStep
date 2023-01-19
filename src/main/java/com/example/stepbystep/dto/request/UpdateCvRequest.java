package com.example.stepbystep.dto.request;

public class UpdateCvRequest {

    private int entryOfUniversityYear;
    private int graduatedYear;
    private int universityId;
    private int majorId;
    private int skillId;

    public UpdateCvRequest() {}

    public UpdateCvRequest(int entryOfUniversityYear, int graduatedYear, int universityId, int majorId, int skillId) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.universityId = universityId;
        this.majorId = majorId;
        this.skillId = skillId;
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

    public int getSkillId() {
        return skillId;
    }
}
