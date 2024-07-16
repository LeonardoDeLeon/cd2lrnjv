package com.alienators.ThirdWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamController 
{
    //localhost:8484/getmessage/Rajesh
    @GetMapping("/getmessage/{name}/{course}")
    public String getSomeMsg(@PathVariable("name") String name,
                            @PathVariable("course") String course,
                             Map<String,Object> model) 
    {
        String msg = "Hey, "+name
            +" You can join the live "
            + course+" course in future";
        model.put("msg",msg);
        return "index";
    }

}
