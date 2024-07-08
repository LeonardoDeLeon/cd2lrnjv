package com.code2learn.SpringAOPExample.service;

import java.util.List;

import com.code2learn.SpringAOPExample.dao.Alien;

public interface IAlienService 
{
    public Alien registerAlienInfo(Alien alien) throws Exception;
    public List<Alien> getAllAlienInfo();

}
