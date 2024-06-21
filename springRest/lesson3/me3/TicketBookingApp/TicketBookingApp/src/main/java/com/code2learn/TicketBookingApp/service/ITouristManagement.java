package com.code2learn.TicketBookingApp.service;

import java.util.List;

import com.code2learn.TicketBookingApp.model.Tourist;

public interface ITouristManagement 
{
    public String registerTourist(Tourist tourist);
    public List<Tourist> fetchAllTourists();
    public Tourist fetchTouristInfoById(Integer id);
    public String updateTouristInfo(Tourist tourist);
}
