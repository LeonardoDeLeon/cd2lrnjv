package com.code2learn.SpringAOPExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer> 
{

}
