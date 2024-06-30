package com.code2learn.REST1.service;

import java.time.LocalDateTime;

import com.code2learn.REST1.controller.Tourist;

public class GreetingServiceImpl implements IGreetingService
{

    @Override
    public String generateSomeWish() 
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
        
        return wish;
    }

    public boolean welcomeTourist(Tourist tourist)
    {
        String msg= "Welcome tourist to our java spring city";
        return true;
    }

}
