package com.code2learn.SpringAOPExample.rest;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code2learn.SpringAOPExample.dao.Alien;
import com.code2learn.SpringAOPExample.service.IAlienService;

@RestController
public class AlienRestApi 
{
    @Autowired
    private IAlienService service;

    @PostMapping("/register")
    public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien) throws Exception
    {
        Alien al=service.registerAlienInfo(alien);
        return new ResponseEntity<>(al, HttpStatus.OK);
    } 

    @GetMapping("/fetch")
    public ResponseEntity<List> fetchAliens()
    {
        System.out.println("Request made to fetch api at "+LocalDateTime.now());
        List<Alien> list=service.getAllAlienInfo();
        return new ResponseEntity<>(list, HttpStatus.OK);
    } 

}
