package com.example.stepbystep.dto.model;

import java.util.Objects;

public class CandidateDto {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private CandidateCvDto candidateCvDto;

    public CandidateDto() {}

    public CandidateDto(String id, String email, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public CandidateDto(String id, String email, String firstName, String lastName, String phoneNumber, CandidateCvDto candidateCvDto) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateDto that = (CandidateDto) o;
        return Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(candidateCvDto, that.candidateCvDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, firstName, lastName, phoneNumber, candidateCvDto);
    }
}
