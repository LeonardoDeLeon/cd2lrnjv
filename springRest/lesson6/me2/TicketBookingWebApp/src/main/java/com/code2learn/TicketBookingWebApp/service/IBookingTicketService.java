package com.code2learn.TicketBookingWebApp.service;

import com.code2learn.TicketBookingWebApp.reqres.Passenger;
import com.code2learn.TicketBookingWebApp.reqres.Ticket;

public interface IBookingTicketService 
{
    public Ticket bookTicket(Passenger passenger);
    public Ticket getFullTicketInfo(Integer ticketNumber);

}
