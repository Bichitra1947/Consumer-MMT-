package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.binding.Passenger;
import com.java.entity.Ticket;
import com.java.service.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@GetMapping("/")
	public String openIndexPage(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@PostMapping("/ticket")
	public String getDataIndexPage(@ModelAttribute Passenger passenger,Model model) {
		Ticket ticket = service.BookTicket(passenger);
		model.addAttribute("ticketData", ticket);
		return "ticket-info";
	}
	
	@GetMapping("/ticket")
	public String getTicketPage(@ModelAttribute Ticket ticket) {
		
		return "getTicket";
	}
	
	@GetMapping("/ticketId")
	public String getTicket(@RequestParam("ticketNo") Integer ticketNo,Model model) {
		Ticket ticket = service.getTicket(ticketNo);
		model.addAttribute("ticket", ticket);
//		System.out.println(ticket.getName());
		
		return "getTicket";
	}
	
	@GetMapping("/tickets")
	public String getAllTicket(Model model) {
		List<Ticket> tickets = service.getAllTicket();
		model.addAttribute("tickets", tickets);
		
		return "viewTickets";
	}
	
	
}







