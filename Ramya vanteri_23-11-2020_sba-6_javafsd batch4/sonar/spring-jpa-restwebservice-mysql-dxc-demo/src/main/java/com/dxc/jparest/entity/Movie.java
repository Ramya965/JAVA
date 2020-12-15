package com.dxc.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movieinfo")
public class Movie {

	@Column(name = "movie_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movie_id;

	@Column(name = "movie_name", nullable = true, length = 255)
	private String movie_name;

	@Column(name = "movie_rating", nullable = true, length = 255)
	private Integer movie_rating;

	@Column(name = "movie_duration", nullable = true, length = 255)
	private Integer movie_duration;

	@Column(name = "movie_category", nullable = true, length = 255)
	private String movie_category;
	
	@Column(name = "movie_recommend", nullable = true, length = 255)
	private String movie_recommend;

	public Movie() {
		super();
	}

	public Movie(Integer movie_id, String movie_name, Integer movie_rating, Integer movie_duration,
			String movie_category, String movie_recommend) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_rating = movie_rating;
		this.movie_duration = movie_duration;
		this.movie_category = movie_category;
		this.movie_recommend = movie_recommend;
	}
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public Integer getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(Integer movie_rating) {
		this.movie_rating = movie_rating;
	}
	public Integer getMovie_duration() {
		return movie_duration;
	}
	public void setMovie_duration(Integer movie_duration) {
		this.movie_duration = movie_duration;
	}
	public String getMovie_category() {
		return movie_category;
	}
	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}
	public String getMovie_recommend() {
		return movie_recommend;
	}
	public void setMovie_recommend(String movie_recommend) {
		this.movie_recommend = movie_recommend;
	}

	public String toString() {
		return "Employee\n{\nmovie_id: " + movie_id + "\nmovie_name: " + movie_name + "\nmovie_rating: " + movie_rating +
				"\nmovie_duration: " + movie_duration + "\nmovie_category: "+ movie_category + "\nmovie_recommend: "+movie_recommend+"\n}";
	}
}
