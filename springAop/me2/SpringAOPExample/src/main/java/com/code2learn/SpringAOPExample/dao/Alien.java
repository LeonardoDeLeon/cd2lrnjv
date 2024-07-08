package com.code2learn.SpringAOPExample.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien 
{
    @Id
    private Integer id;

    private String name;

    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + ", city=" + city + "]";
    }

    public Alien() 
    {
        super();
    }

    public Alien(Integer id, String name, String city) 
    {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }



}
