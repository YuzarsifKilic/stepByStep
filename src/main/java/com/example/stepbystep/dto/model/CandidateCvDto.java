package com.example.stepbystep.dto.model;

import java.util.Set;

public class CandidateCvDto {

    private int entryOfUniversityYear;
    private int graduatedYear;
    private UniversityDto universityDto;
    private MajorDto majorDto;
    private Set<ExperienceDto> experienceDtos;

    public CandidateCvDto() {}

    public CandidateCvDto(int entryOfUniversityYear, int graduatedYear, UniversityDto universityDto, MajorDto majorDto, Set<ExperienceDto> experienceDtos) {
        this.entryOfUniversityYear = entryOfUniversityYear;
        this.graduatedYear = graduatedYear;
        this.universityDto = universityDto;
        this.majorDto = majorDto;
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

    public UniversityDto getUniversityDto() {
        return universityDto;
    }

    public void setUniversityDto(UniversityDto universityDto) {
        this.universityDto = universityDto;
    }

    public MajorDto getMajorDto() {
        return majorDto;
    }

    public void setMajorDto(MajorDto majorDto) {
        this.majorDto = majorDto;
    }

    public Set<ExperienceDto> getExperienceDtos() {
        return experienceDtos;
    }

    public void setExperienceDtos(Set<ExperienceDto> experienceDtos) {
        this.experienceDtos = experienceDtos;
    }
}
