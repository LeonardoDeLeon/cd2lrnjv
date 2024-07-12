package com.alienators.FirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController 
{
    @RequestMapping("/welcome")
    public ModelAndView displaySomeMessage() 
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Hello! Welcome to our  first web app!");
        mav.setViewName("index");//LVN
        return mav;
    }
}
