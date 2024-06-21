package com.code2learn.REST1.pojo;

public class Alien 
{
    private Integer Id;
    private String name;
    private String city;
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
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
        return "Alien [Id=" + Id + ", name=" + name + ", city=" + city + "]";
    }

    

}
