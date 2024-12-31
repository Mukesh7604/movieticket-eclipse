package com.project.movieticketbooking.dto;

import lombok.Data;

@Data
public class ScreenDto {

	private String screenName;
	private int screenTotalSeats;
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public int getScreenTotalSeats() {
		return screenTotalSeats;
	}
	public void setScreenTotalSeats(int screenTotalSeats) {
		this.screenTotalSeats = screenTotalSeats;
	}

}
