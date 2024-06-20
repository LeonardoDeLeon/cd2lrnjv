package com.alienators.SpringDataJpaMongoDb.dto;

public class CustomerDto 
{
    private String id;
    
    private Integer cxNo;

    private String name;

    private String city;

    public CustomerDto() 
    {
        super();
    }

    public CustomerDto(String id, Integer cxNo, String name, String city) {
        super();
        this.id = id;
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

}
