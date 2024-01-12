package com.java.service;

import java.util.List;

import com.java.binding.Passenger;
import com.java.entity.Ticket;

public interface TicketService {
	
	public Ticket BookTicket(Passenger passenger);
	public Ticket getTicket(Integer id);
	public List<Ticket> getAllTicket();

}
