package com.alienators.ThirdWebApp.controller;

public class Implementer 
{
    private Integer id; 

    private String iname="Shola Shaka";

    private String icity="London";

    private Double isalary;

    public Implementer() 
    {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIcity() {
        return icity;
    }

    public void setIcity(String icity) {
        this.icity = icity;
    }

    public Double getIsalary() {
        return isalary;
    }

    public void setIsalary(Double isalary) {
        this.isalary = isalary;
    }

    @Override
    public String toString() {
        return "Implementer [id=" + id + ", iname=" + iname + ", icity=" + icity + ", isalary=" + isalary + "]";
    }
    
}
