package com.project.movieticketbooking.entity;

import java.util.List;
import java.util.Map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int screenId;
	private String screenName;
	@ElementCollection
	private Map<String, Boolean> map;
	@ManyToOne(cascade = CascadeType.ALL)
	private Theatre theatre;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Movieshow> show;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Seat> seat;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Map<String, Boolean> getMap() {
		return map;
	}
	public void setMap(Map<String, Boolean> map) {
		this.map = map;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public List<Movieshow> getShow() {
		return show;
	}
	public void setShow(List<Movieshow> show) {
		this.show = show;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", map=" + map + ", theatre=" + theatre
				+ ", show=" + show + ", seat=" + seat + "]";
	}
	public Screen(int screenId, String screenName, Map<String, Boolean> map, Theatre theatre, List<Movieshow> show,
			List<Seat> seat) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.map = map;
		this.theatre = theatre;
		this.show = show;
		this.seat = seat;
	}
	public Screen() {
		super();
	}
	
}
