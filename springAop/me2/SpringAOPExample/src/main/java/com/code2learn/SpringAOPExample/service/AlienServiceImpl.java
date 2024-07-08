package com.code2learn.SpringAOPExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2learn.SpringAOPExample.dao.Alien;
import com.code2learn.SpringAOPExample.dao.AlienRepo;

@Service
public class AlienServiceImpl implements IAlienService
{
    @Autowired
    private AlienRepo repo;

    @Override
    public Alien registerAlienInfo(Alien alien) throws Exception
    {
        String name = alien.getName();
        if (name.length()!=5)
            throw new Exception("Invalid name length exception");
        else
            return repo.save(alien);
    }

    @Override
    public List<Alien> getAllAlienInfo()
    {
        return repo.findAll();
    }

}
