package com.project.movieticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationId;
	private String streetName;
	private String landMark;
	private int pinCode;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", streetName=" + streetName + ", landMark=" + landMark
				+ ", pinCode=" + pinCode + "]";
	}
	public Location(int locationId, String streetName, String landMark, int pinCode) {
		super();
		this.locationId = locationId;
		this.streetName = streetName;
		this.landMark = landMark;
		this.pinCode = pinCode;
	}
	public Location() {
		super();
	}
	
}
