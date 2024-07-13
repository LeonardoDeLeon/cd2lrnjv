package com.alienators.ThirdWebApp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.alienators.ThirdWebApp.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetingController 
{
    @Autowired
    private IGreetingService greet;

    // @GetMapping("/greeting")
    // public void greeting(Map<String,Object> map)
    // {
    //     // String wish=greet.generateGreetings();
    //     // map.put("wish",wish);
    //     map.put("wish",greet.generateGreetings());
    //     // return "greeting";
    // }
    // @GetMapping("/greeting2")
    // public Map<String,Object> greeting2()
    // {
    //     Map<String,Object> map = new HashMap<>();
    //     map.put("wish",greet.generateGreetings());
    //     return map;
    // }
    @GetMapping("/getGreet")
    public void greeting3(HttpServletResponse response)
    {
        try (PrintWriter writer = response.getWriter()) {
            writer.println("<h1>Hello this is from Controller directly using servlet -> "+greet.generateGreetings()+"</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
