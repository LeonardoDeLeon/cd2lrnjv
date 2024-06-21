package com.code2learn.TicketBookingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2learn.TicketBookingApp.dao.ITouristRepo;
import com.code2learn.TicketBookingApp.exception.TouristNotFoundException;
import com.code2learn.TicketBookingApp.model.Tourist;

@Service
public class TouristManagementImpl implements ITouristManagement 
{
    @Autowired
    private ITouristRepo repo;

    @Override
    public String registerTourist(Tourist tourist) 
    {
        Integer id=repo.save(tourist).getTid();
        return "Tourist info saved with an id "+id;
    }

    @Override
    public List<Tourist> fetchAllTourists() 
    {
        return repo.findAll();
    }

    @Override
    public Tourist fetchTouristInfoById(Integer id) 
    {
        return repo.findById(id)
            .orElseThrow(()->new TouristNotFoundException("Tourist not found with id : "+id));
    }

}

