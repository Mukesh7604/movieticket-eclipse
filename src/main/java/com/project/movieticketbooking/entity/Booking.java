package com.project.movieticketbooking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String bookingSeats;
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingSeats() {
		return bookingSeats;
	}
	public void setBookingSeats(String bookingSeats) {
		this.bookingSeats = bookingSeats;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingSeats=" + bookingSeats + ", user=" + user + "]";
	}
	public Booking(int bookingId, String bookingSeats, User user) {
		super();
		this.bookingId = bookingId;
		this.bookingSeats = bookingSeats;
		this.user = user;
	}
	public Booking() {
		super();
	}

}
