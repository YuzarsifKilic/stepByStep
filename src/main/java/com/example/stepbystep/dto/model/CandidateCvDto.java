package com.example.stepbystep.dto.model;

import com.example.stepbystep.model.Major;
import com.example.stepbystep.model.University;

import java.util.Set;

public class CandidateCvDto {

    private int entryOfUniversityYear;
    private int graduatedYear;
    private University university;
    private Major major;
    private Set<CvExperienceDto> experienceDtos;

    public CandidateCvDto() {}

    public CandidateCvDto(int entryOfUniversityYear, int graduatedYear, University university, Major major, Set<CvExperienceDto> experienceDtos) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.university = university;
        this.major = major;
        this.experienceDtos = experienceDtos;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Set<CvExperienceDto> getExperienceDtos() {
        return experienceDtos;
    }

    public void setExperienceDtos(Set<CvExperienceDto> experienceDtos) {
        this.experienceDtos = experienceDtos;
    }
}
