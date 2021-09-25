package com.backend.service.backendservice.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Company {

    private Long id;
    private String name;
    private String location;
    private int nbbuilding;

    public Company(Long id, String name, String location, int nbbuilding){
        this.id = id;
        this.name = name;
        this.location = location;
        this.nbbuilding = nbbuilding;
    }

    public Company() {}

    @Id
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getnbbuilding() {
        return nbbuilding;
    }

    public void setnbbuilding(int nbbuilding) {
        this.nbbuilding = nbbuilding;
    }

}
