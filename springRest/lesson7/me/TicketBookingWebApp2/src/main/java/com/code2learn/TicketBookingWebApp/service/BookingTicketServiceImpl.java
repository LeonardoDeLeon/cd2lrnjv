package com.code2learn.TicketBookingWebApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

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
        //Get the WebClient w/o the new keyword
        WebClient webClient=WebClient.create();

        Ticket ticket=webClient.post()
        .uri(BOOKING_URL)
        .bodyValue(passenger)
        .retrieve()
        .bodyToMono(Ticket.class)
        .block(); // make it synchronous

        return ticket;
    }

    @Override
    public Ticket getFullTicketInfo(Integer ticketNumber) 
    {
        //  the reactive web client object, from web.reactive.function.client.WebClient
        WebClient webClient=WebClient.create();

        Ticket ticket=webClient.get()
            .uri(GET_URL,ticketNumber)
            .retrieve()
            .bodyToMono(Ticket.class)
            .block();

        return ticket;
    }

}
