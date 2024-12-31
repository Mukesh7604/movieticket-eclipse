package com.project.movieticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	private String movieName;
	private String movieshow;
	private int noOfSeats;
	private double ticketCost;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieshow() {
		return movieshow;
	}
	public void setMovieshow(String movieshow) {
		this.movieshow = movieshow;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", movieName=" + movieName + ", movieshow=" + movieshow + ", noOfSeats="
				+ noOfSeats + ", ticketCost=" + ticketCost + "]";
	}
	public Ticket(int ticketId, String movieName, String movieshow, int noOfSeats, double ticketCost) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.movieshow = movieshow;
		this.noOfSeats = noOfSeats;
		this.ticketCost = ticketCost;
	}
	public Ticket() {
		super();
	}

}
