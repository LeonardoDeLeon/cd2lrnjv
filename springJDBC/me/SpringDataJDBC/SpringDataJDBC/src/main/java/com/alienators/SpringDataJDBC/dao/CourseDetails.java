package com.alienators.SpringDataJDBC.dao;

public class CourseDetails {

    private Integer cid;
    private String cname;
    public CourseDetails() {
        super();
    }
    public CourseDetails(Integer cid, String cname) {
        super();
        this.cid = cid;
        this.cname = cname;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Integer getCid() {
        return cid;
    }
    public String getCname() {
        return cname;
    }

    
}
