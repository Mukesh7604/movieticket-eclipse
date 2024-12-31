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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userEmail;
	private long userContact;
	private String userPassword;
	private String confirmuserPassword;
	@OneToOne(cascade = CascadeType.ALL)
	private Booking booking;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getConfirmuserPassword() {
		return confirmuserPassword;
	}
	public void setConfirmuserPassword(String confirmuserPassword) {
		this.confirmuserPassword = confirmuserPassword;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userContact="
				+ userContact + ", userPassword=" + userPassword + ", confirmuserPassword=" + confirmuserPassword
				+ ", booking=" + booking + "]";
	}
	public User(int userId, String userName, String userEmail, long userContact, String userPassword,
			String confirmuserPassword, Booking booking) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userPassword = userPassword;
		this.confirmuserPassword = confirmuserPassword;
		this.booking = booking;
	}
	public User() {
		super();
	}

}
