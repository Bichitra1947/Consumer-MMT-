package com.java.binding;

import java.time.LocalDate;

public class Passenger {

	private String name;
	private String email;
	private String gender;
	private Long phoneNo;
	private String from;
	private String to;
	private LocalDate doj;
	
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", gender=" + gender + ", phoneNo=" + phoneNo
				+ ", from=" + from + ", to=" + to + ", doj=" + doj + "]";
	}	

}
