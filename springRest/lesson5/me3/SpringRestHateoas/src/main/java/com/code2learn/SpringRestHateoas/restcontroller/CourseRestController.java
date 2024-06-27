package com.code2learn.SpringRestHateoas.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseRestController 
{
    @GetMapping("/getcourse/{id}")
    public ResponseEntity<Course> getCourseDetails(@PathVariable("id") Integer id)
    {
        Course course=new Course(104,"SBM",9999.9);

        Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
                            .methodOn(CourseRestController.class)
                            .getCourseJava()).withRel("getjava ");
    
        course.add(link);

        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }

    @GetMapping("/getallcourses")
    public List<Course> getCoursesDetails()
    {
        List<Course> courses=new ArrayList<>();
        courses.add(new Course(104,"SBM",9999.9));
        courses.add(new Course(105,"React",8888.9));
        courses.add(new Course(106,"Devops with AWS",9999.9));
        return courses;
    }

    @GetMapping("/getjava")
    public List<Course> getCourseJava()
    {
        List<Course> courses=new ArrayList<>();
        courses.add(new Course(104,"Java",999.9));

        return courses;
    }

    @GetMapping("/getthread/{id}")
    public ResponseEntity<Course> getJavaCourse(@PathVariable("id") Integer id)
    {
        Course course=new Course(144,"Multithreading",9999.9);

        Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
                        .methodOn(CourseRestController.class)
                        .getCoursesDetails()).withRel("getallcourses");
                    
        course.add(link);

        return new ResponseEntity<Course>(course,HttpStatus.OK);
    }

}
