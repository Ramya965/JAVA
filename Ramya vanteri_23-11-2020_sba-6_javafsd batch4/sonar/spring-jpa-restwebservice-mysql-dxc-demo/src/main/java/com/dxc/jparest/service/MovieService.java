package com.dxc.jparest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jparest.dao.MovieDAO;
import com.dxc.jparest.entity.Movie;

@Service
public class MovieService {

	@Autowired
	MovieDAO movieDao;
	
	public List<Movie> getAllMovie() {
		return this.movieDao.findAll();
	}
	
	public Movie addMovie(Movie movieinfo) {
		return this.movieDao.save(movieinfo);
	}
	
	// Optional is a Container object which may or may not contain non null values
	public Optional <Movie> getMovieById(int id ) {
		return this.movieDao.findById(id);
	}
	
	public Movie updateMovie(Movie movieinfo) {
		return this.movieDao.save(movieinfo);
	}
	
	public void deleteMovieById(int id) {
		this.movieDao.deleteById(id);
	}
	
	public void deleteAllMovies() {
		this.movieDao.deleteAll();
	}
}
