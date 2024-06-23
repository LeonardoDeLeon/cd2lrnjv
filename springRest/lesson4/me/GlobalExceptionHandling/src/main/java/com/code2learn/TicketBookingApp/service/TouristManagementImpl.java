package com.code2learn.TicketBookingApp.service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public String updateTouristInfo(Tourist tourist) 
    {
        Integer id=tourist.getTid();
        Optional<Tourist> optional=repo.findById(id);
        if(optional.isPresent())
        {
            repo.save(tourist);
            return "Tourist  info with id "+id+" is updated";
        }
        else
        {
            throw new TouristNotFoundException("Tourist with given info not found to udate");
        }
    }

    @Override
    public String updateTouristInfoById(Integer id, Double budget) 
    {
        Optional<Tourist> optional=repo.findById(id);
        if(optional.isPresent())
        {
            Tourist tourist=optional.get();
            tourist.setBudget(budget);
            repo.save(tourist);
            return "Tourist  info with id "+id+" is updated";
        }
        else
        {
            throw new TouristNotFoundException("Tourist with given info not found to update");
        }
    }

    @Override
    public String deleteTouristById(Integer id) 
    {
        Optional<Tourist> optional=repo.findById(id);
        if(optional.isPresent())
        {
            // option 1
            // Tourist tourist=optional.get();
            // repo.delete(tourist);

            // option 2 
            repo.deleteById(id);
            return "Tourist  info with id "+id+" is deleted";                    
        }
        else
        {
            throw new TouristNotFoundException("Tourist with given info not found to delete");
        }        
    }

}

