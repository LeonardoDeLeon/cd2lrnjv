package com.code2learn.REST1.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code2learn.REST1.service.IGreetingService;

@Controller
// @RequestMapping("/api")
public class GreetingController 
{
    @Autowired
    public IGreetingService service;

    @GetMapping("/greet")
    public ResponseEntity<String> generateGreetings() 
    {
        String wish=service.generateSomeWish();
        return new ResponseEntity<String>(wish, HttpStatus.OK);
    }

    @PostMapping("/tourist")
    public ResponseEntity<String> acceptTouristInfo(@RequestBody Tourist tourist) 
    {
        boolean status=service.welcomeTourist(tourist);
        String msg = null;
        if (status==true)
        {
            msg="Tourist welcomed and request is considered";
            return new ResponseEntity<String>(msg, HttpStatus.CREATED);
        
        }
        else
        {
            msg="Tourist couldnt welcomed and request is not considered";
            return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
        }

    }

     
}
