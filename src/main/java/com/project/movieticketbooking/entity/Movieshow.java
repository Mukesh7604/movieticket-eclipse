package com.project.movieticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movieshow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieshowid;
	private int theatreId;
	private int screenId;
	private String showTiming;
	public int getMovieshowid() {
		return movieshowid;
	}
	public void setMovieshowid(int movieshowid) {
		this.movieshowid = movieshowid;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getShowTiming() {
		return showTiming;
	}
	public void setShowTiming(String showTiming) {
		this.showTiming = showTiming;
	}
	@Override
	public String toString() {
		return "Movieshow [movieshowid=" + movieshowid + ", theatreId=" + theatreId + ", screenId=" + screenId
				+ ", showTiming=" + showTiming + "]";
	}
	public Movieshow(int movieshowid, int theatreId, int screenId, String showTiming) {
		super();
		this.movieshowid = movieshowid;
		this.theatreId = theatreId;
		this.screenId = screenId;
		this.showTiming = showTiming;
	}
	public Movieshow() {
		super();
	}

}
