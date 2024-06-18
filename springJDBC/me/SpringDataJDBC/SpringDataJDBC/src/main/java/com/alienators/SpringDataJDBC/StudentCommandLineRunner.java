package com.alienators.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alienators.SpringDataJDBC.dao.CourseDetails;
import com.alienators.SpringDataJDBC.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

    @Autowired
    private SpringJdbc jdbc;

    public void run(String... args) throws Exception {

        // jdbc.insert();
        // jdbc.delete(1);
        CourseDetails cd=new CourseDetails(1,"JS");
        jdbc.insert(cd);
        jdbc.delete(1);
    }
}
