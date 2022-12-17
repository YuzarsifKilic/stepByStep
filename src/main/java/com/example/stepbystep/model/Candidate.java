package com.example.stepbystep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Candidate extends User{

    private String firstName;
    private String lastName;
    private String telNo;

    public Candidate() {}

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
}