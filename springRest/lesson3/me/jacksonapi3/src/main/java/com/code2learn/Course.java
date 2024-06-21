package com.code2learn;

public class Course 
{
    private Integer cid;

    private String cname;

    private String instructorName;

    private Integer price;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + ", instructorName=" + instructorName + ", price=" + price
                + "]";
    }

    

}
