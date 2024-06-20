package com.alienators.SpringDataJpaMongoDb.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer 
{
    @Id
    private String id;

    private Integer cxNo;

    private String name;

    private String city;

    public Customer() {
        super();
    }

    public Customer(Integer cxNo, String name, String city) {
        super();
        this.cxNo = cxNo;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCxNo() {
        return cxNo;
    }

    public void setCxNo(Integer cxNo) {
        this.cxNo = cxNo;
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
        return "Customer [id=" + id + ", cxNo=" + cxNo + ", name=" + name + ", city=" + city + "]";
    }

}
