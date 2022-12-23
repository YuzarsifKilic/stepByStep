package com.example.stepbystep.dto.model;

public class CandidateDto {

    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private CandidateCvDto candidateCvDto;

    public CandidateDto() {}

    public CandidateDto(String email, String firstName, String lastName, String phoneNumber, CandidateCvDto candidateCvDto) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.candidateCvDto = candidateCvDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CandidateCvDto getCandidateCvDto() {
        return candidateCvDto;
    }

    public void setCandidateCvDto(CandidateCvDto candidateCvDto) {
        this.candidateCvDto = candidateCvDto;
    }
}
