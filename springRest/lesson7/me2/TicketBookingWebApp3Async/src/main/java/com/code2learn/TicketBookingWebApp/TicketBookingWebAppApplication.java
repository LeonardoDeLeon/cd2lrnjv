package com.code2learn.TicketBookingWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.code2learn.TicketBookingWebApp.reqres.Ticket;

@SpringBootApplication
public class TicketBookingWebAppApplication 
{
	private static String GET_URL =
    "http://localhost:8484/TicketBookingApp/api/book-ticket/getTicket/{ticketNumber}";

	public static void main(String[] args) 
	{
		SpringApplication.run(TicketBookingWebAppApplication.class, args);

		System.out.println("Before or request to API started....");

		WebClient webClient=WebClient.create();

        // Ticket ticket=webClient.get()
        //     .uri(GET_URL,333444)
        //     .retrieve()
        //     .bodyToMono(Ticket.class)
        //     .block();

		webClient.get()
			.uri(GET_URL,333444)
			.retrieve()
			.bodyToMono(String.class).subscribe(TicketBookingWebAppApplication::handleResponse);
			//.block();

		// System.out.println(ticket);

		System.out.println("After or request to API ended....");
	}

	public static void handleResponse(String ticket)
	{
		System.out.println(ticket);
	}

}
