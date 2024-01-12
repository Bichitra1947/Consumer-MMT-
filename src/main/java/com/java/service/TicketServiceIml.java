package com.java.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.binding.Passenger;
import com.java.entity.Ticket;
import com.java.repository.TicketRepository;

@Service
public class TicketServiceIml implements TicketService {

	@Autowired
	private TicketRepository repository;
	@Override
	public Ticket BookTicket(Passenger passenger) {
		String url="http://localhost:9090/bookTicket";
		RestTemplate template=new RestTemplate();
		ResponseEntity<Ticket> responseEntity = template.postForEntity(url, passenger, Ticket.class);
//		repository.save(ticket);
		Ticket ticket1 = responseEntity.getBody();
		repository.save(ticket1);
		return ticket1;
	}

	@Override
	public Ticket getTicket(Integer id) {

		Optional<Ticket> optional = repository.findById(id);
		
		if(optional.isEmpty()) {
			System.out.println("Ticket object is empty");
		}
		Ticket ticket = optional.get();
		return ticket;
	}

	@Override
	public List<Ticket> getAllTicket() {
		String url="http://localhost:9090/tickets";
		RestTemplate template=new RestTemplate();
		ResponseEntity<Ticket[]> entity = template.getForEntity(url, Ticket[].class);
		Ticket[] tickets = entity.getBody();
		List<Ticket> list = Arrays.asList(tickets);
		
//		List<Ticket> list = repository.findAll();
		return list;
	}

}
