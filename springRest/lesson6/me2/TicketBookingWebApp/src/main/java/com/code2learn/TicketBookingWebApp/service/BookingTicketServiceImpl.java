package com.code2learn.TicketBookingWebApp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.code2learn.TicketBookingWebApp.reqres.Passenger;
import com.code2learn.TicketBookingWebApp.reqres.Ticket;

@Service
public class BookingTicketServiceImpl implements IBookingTicketService
{
    private String BOOKING_URL=
        "http://localhost:8484/TicketBookingApp/api/book-ticket/getTicketNumber";

    private String GET_URL =
    "http://localhost:8484/TicketBookingApp/api/book-ticket/getTicket/{ticketNumber}";

    @Override
    public Ticket bookTicket(Passenger passenger) 
    {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<Ticket> responseEntity=restTemplate.postForEntity(BOOKING_URL, passenger, Ticket.class);
        return responseEntity.getBody();
    }

    @Override
    public Ticket getFullTicketInfo(Integer ticketNumber) 
    {
        RestTemplate restTemplate=new RestTemplate();
        Ticket response=restTemplate.getForObject(GET_URL, Ticket.class,ticketNumber);
        return response;
    }

}
