package com.alienators.SpringDataJpa2.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerInfo 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer cid;
    
    private String cname;
    private String ccity;
    private LocalDateTime dob;
    private LocalTime regTime;
    private LocalDate regDate;
    
    public CustomerInfo() {
        super();
    }

    public CustomerInfo(String cname, String ccity, LocalDateTime dob, LocalTime regTime, LocalDate regDate) {
        super();
        this.cname = cname;
        this.ccity = ccity;
        this.dob = dob;
        this.regTime = regTime;
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "CustomerInfo [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + ", dob=" + dob + ", regTime="
                + regTime + ", regDate=" + regDate + "]";
    }

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public String getCcity() {
        return ccity;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public LocalTime getRegTime() {
        return regTime;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    
}
