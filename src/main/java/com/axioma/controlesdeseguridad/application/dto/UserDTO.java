package com.axioma.controlesdeseguridad.application.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String lastname;
    private String job;
    private String signature;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String lastname, String job, String signature) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.job = job;
        this.signature = signature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
