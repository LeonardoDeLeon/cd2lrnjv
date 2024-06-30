package com.code2learn.REST1.controller;

public class Tourist 
{
    private Integer tid;

    private String name;

    private String city;

    private String packageType;

    private Double budget;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Tourist [tid=" + tid + ", name=" + name + ", city=" + city + ", packageType=" + packageType
                + ", budget=" + budget + "]";
    }

    public Tourist(Integer tid, String name, String city, String packageType, Double budget) {
        this.tid = tid;
        this.name = name;
        this.city = city;
        this.packageType = packageType;
        this.budget = budget;
    }
    
    
}
