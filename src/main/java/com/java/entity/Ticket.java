package com.java.entity;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Ticket {

	@Id
	@GeneratedValue
	@Column
	private Integer ticketNo;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String gender;
	@Column
	private Long phoneNo;
	@Column(name = "from_addr")
	private String from;
	@Column(name = "to_addr")
	private String to;
	@Column
	private Integer price;
	@Column
//	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate doj;
	@Column
	private Integer tarinNo;
	@Column
	private String status; 
	
	public Integer getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Integer ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Integer getTarinNo() {
		return tarinNo;
	}
	public void setTarinNo(Integer tarinNo) {
		this.tarinNo = tarinNo;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", phoneNo=" + phoneNo + ", from=" + from + ", to=" + to + ", price=" + price + ", doj=" + doj
				+ ", tarinNo=" + tarinNo + ", status=" + status + "]";
	}
	
	
}
