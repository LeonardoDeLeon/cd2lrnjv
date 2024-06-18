package com.alienators.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc {

    private static final String SQL_QUERY = "INSERT INTO student(id, name, city) " 
        + "values(1, 'Virat', 'Bengaluru')";

    private static final String SQL_QUERY_course = "INSERT INTO course(cid, cname) VALUES(?,?)"; 
    
    private static final String SQL_QUERY_DELETE = "DELETE FROM course WHERE cid=?"; 

    @Autowired
    private JdbcTemplate jdbc;
    
    public void insert(){
        System.out.println("JdbcTemplate: "+jdbc.getClass().getName());
        System.out.println("Control is in inserts");
        jdbc.update(SQL_QUERY);
    }
    public void insert(CourseDetails course){
        System.out.println("Control is in inserts course");
        jdbc.update(SQL_QUERY_course,course.getCid(),course.getCname());
    }
    public void delete(Integer id){
        System.out.println("Control is in delete");
        int rowAffected=jdbc.update(SQL_QUERY_DELETE,id);
        System.out.println("Rows deleted: "+rowAffected);
    }

}
