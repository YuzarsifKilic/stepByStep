package com.example.stepbystep.dto.model;

public class JobAdvertisementEmployerDto {

    private String email;
    private String companyName;
    private String webSite;

    public JobAdvertisementEmployerDto() {}

    public JobAdvertisementEmployerDto(String email, String companyName, String webSite) {
        this.email = email;
        this.companyName = companyName;
        this.webSite = webSite;
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
}
