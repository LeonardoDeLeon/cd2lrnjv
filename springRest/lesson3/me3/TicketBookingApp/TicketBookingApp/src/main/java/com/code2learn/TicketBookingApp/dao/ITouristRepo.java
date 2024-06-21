package com.code2learn.TicketBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code2learn.TicketBookingApp.model.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist,Integer> 
{

}
