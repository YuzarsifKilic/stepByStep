package com.example.stepbystep.dto.model;

import java.util.HashSet;
import java.util.Set;

public class EmployerDto {

    private String id;
    private String email;
    private String companyName;
    private String webSite;
    private Set<EmployerJobAdvertisementDto> employerJobAdvertisementDtos = new HashSet<>();

    public EmployerDto() {}

    public EmployerDto(String id, String email, String companyName, String webSite, Set<EmployerJobAdvertisementDto> employerJobAdvertisementDtos) {
        this.id = id;
        this.email = email;
        this.companyName = companyName;
        this.webSite = webSite;
        this.employerJobAdvertisementDtos = employerJobAdvertisementDtos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Set<EmployerJobAdvertisementDto> getEmployerJobAdvertisementDtos() {
        return employerJobAdvertisementDtos;
    }
}
