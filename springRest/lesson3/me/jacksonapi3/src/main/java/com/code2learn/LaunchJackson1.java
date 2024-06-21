package com.code2learn;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchJackson1 
{
    public static void main(String[] args) throws IOException 
    {
        // create objectmapper
        ObjectMapper mapper=new ObjectMapper();

        // Json to java
        Alien alien = mapper.readValue(new File("json/sample-complex.json"),Alien.class);

        Integer id=alien.getId();
        String name=alien.getName();
        String city=alien.getCity();
        Course course=alien.getCourse();

        System.out.println(id + " : "+ name+ " : "+ city);
        System.out.println(course);

        String[] hobbies=alien.getHobbies();
        for(String hobby:hobbies) 
        {
            System.out.println(hobby+ " ");
        }
    }

}
