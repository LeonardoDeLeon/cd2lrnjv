package com.code2learn.REST1.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class GreetingController 
{
    @GetMapping("/greet")
    @ResponseBody
    public ResponseEntity<String> generateGreetings() 
    {
        LocalDateTime dateTime=LocalDateTime.now();
        int hour=dateTime.getHour();
        String wish=null;
        if (hour<12)
        {
            wish="Good Morning";
        } 
        else if(hour <16)
        {
            wish="Good Afternoon";
        } 
        else if(hour<20)
        {
            wish="Good Evening";
        }
        else 
        {
            wish="Good Night";
        }
        
        return new ResponseEntity<String>(wish, HttpStatus.OK);

    }
     
}
