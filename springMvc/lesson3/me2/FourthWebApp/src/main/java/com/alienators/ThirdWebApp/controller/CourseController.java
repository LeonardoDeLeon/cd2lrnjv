package com.alienators.ThirdWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController 
{
    @GetMapping("/courseinfo")
    public String getCourseInfo(Map<String,Object> model)
    {
        Course course = new Course(101,"DevOps",4994.4);
        model.put("course",course);

        return "course";
    }
    @GetMapping("/course")
    public String getCourseInfo2(Map<String,Object> model)
    {
        model.put("cid",111);
        model.put("cname","GoLang");
        model.put("price",444);

        return "courseinfo";
    }

}
