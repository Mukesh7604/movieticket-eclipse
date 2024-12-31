package com.project.movieticketbooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieTitle;
	private String duration;
	private String language;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Movieshow> show;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen> screen;
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", duration=" + duration + ", language="
				+ language + ", show=" + show + ", screen=" + screen + "]";
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<Movieshow> getShow() {
		return show;
	}
	public void setShow(List<Movieshow> show) {
		this.show = show;
	}
	public List<Screen> getScreen() {
		return screen;
	}
	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}
	public Movie(int movieId, String movieTitle, String duration, String language, List<Movieshow> show,
			List<Screen> screen) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.duration = duration;
		this.language = language;
		this.show = show;
		this.screen = screen;
	}
	public Movie() {
		super();
	}

}
