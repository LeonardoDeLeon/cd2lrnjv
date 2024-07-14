package com.alienators.ThirdWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamController 
{
    //localhost:8484/get?name=Srini&course=java
    @GetMapping("/get")
    public String generateSomeMsg(@RequestParam("name") String n, @RequestParam("course") String c, Map<String,Object> model) 
    {
        String msg="Hey there! "+n+" I hope you are enjoying the journey of learning "+c;
        model.put("msg",msg);
        return "index";
    }

}
