package com.axioma.controlesdeseguridad.domain.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "usuarios")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String job;
    private String signature;

    public User() {
    }

    public User(Long id, String name, String lastname, String job, String signature) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.job = job;
        this.signature = signature;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJob() {
        return job;
    }

    public String getSignature() {
        return signature;
    }
}
