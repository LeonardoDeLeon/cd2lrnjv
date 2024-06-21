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
        Alien alien = mapper.readValue(new File("json/sample.json"),Alien.class);

        System.out.println(alien);
    }

}
