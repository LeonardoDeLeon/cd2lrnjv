package com.alienators.FirstWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping("/controller1")
public class FirstController 
{
    // @RequestMapping(value="/welcome2",method=RequestMethod.GET)
    // @RequestMapping("/welcome2")
    // @GetMapping("/welcome2")
    @PostMapping("/welcome2")
    public String displaySomeMessage1(Model model) 
    {
        System.out.println("Model is implemented by "+model.getClass().getName());
        model.addAttribute("message", "Welcome Back Aliens! My name is Navin Reddy!");
        return "home";//LVN
    }
    @GetMapping("/welcome2")
    public String displaySomeMessage2(Model model) 
    {
        System.out.println("Model is implemented by "+model.getClass().getName());
        model.addAttribute("message", "Welcome Back Aliens! My name is Navin Reddy! In this video you will learn about web app!");
        return "home";//LVN
    }
    @GetMapping("/course")
    public String displaySomeMessage3(Map<String,Object> model) 
    {
        System.out.println("In dsm3, /course implemented by "+model.getClass().getName());
        model.put("key", "I hope you are learning well at Telusko");
        return "course";//LVN
    }
    @GetMapping("/telusko")
    public void displaySomeMessage4(Map<String,Object> model) 
    {
        System.out.println("Model is implemented by "+model.getClass().getName());
        model.put("key", "Shape your skills, shape your success");
        return;//LVN
    }
}
