package com.alienators.ThirdWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class TestController 
{
    
    @GetMapping("/home")
    public String showHomePage()
    {
        return "home";
    }

    @GetMapping("/response")
    public String showSomeResponse(Map<String,Object> model)
    {
        String[] booksName=new String[]{"Java","JUnit5","Spring Boot"};
        // for(String name:booksName)
        // {
        //     System.out.println(name);
        // }
        model.put("books",booksName);
        return "response";
    }

}
