package com.example.stepbystep.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Candidate extends User{

    private String firstName;
    private String lastName;
    private String telNo;
    @OneToOne(mappedBy = "candidate")
    private Cv cv;

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }

    public Candidate() {}

    public Candidate(String email, String password, String firstName, String lastName, String telNo, Cv cv) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
        this.cv = cv;
    }
    public Candidate(String email, String password, String firstName, String lastName, String telNo) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
    }

    public Candidate(String id, String email, String password, String firstName, String lastName, String telNo) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
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

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(firstName, candidate.firstName) && Objects.equals(lastName, candidate.lastName) && Objects.equals(telNo, candidate.telNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, telNo);
    }
}
