package com.code2learn.TicketBookingApp.service;

import com.code2learn.TicketBookingApp.model.Passenger;

public interface ITicketBookingService 
{
    public Passenger registerPassenger(Passenger passenger);
    public Passenger fetchPassengerInfo(Integer id);

}
