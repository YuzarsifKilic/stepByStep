package com.example.stepbystep.dto.model;

public class MajorDto {

    private int id;
    private String majorName;

    public MajorDto() {}

    public MajorDto(int id, String majorName) {
        this.id = id;
        this.majorName = majorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
