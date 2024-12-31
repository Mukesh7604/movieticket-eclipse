package com.project.movieticketbooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theatreId;
	private String theatreName;
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen> screen;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<Screen> getScreen() {
		return screen;
	}
	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", location=" + location
				+ ", screen=" + screen + "]";
	}
	public Theatre(int theatreId, String theatreName, Location location, List<Screen> screen) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.screen = screen;
	}
	public Theatre() {
		super();
	}

}
