package com.example.stepbystep.dto.request;

public class CreateEmployerRequest {

    private String id;
    private String email;
    private String password;
    private String companyName;
    private String webSite;

    public CreateEmployerRequest() {}

    public CreateEmployerRequest(String id, String email, String password, String companyName, String webSite) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.companyName = companyName;
        this.webSite = webSite;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
