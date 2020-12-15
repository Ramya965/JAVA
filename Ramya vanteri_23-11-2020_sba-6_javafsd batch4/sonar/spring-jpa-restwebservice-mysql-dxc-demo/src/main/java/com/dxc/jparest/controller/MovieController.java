package com.dxc.jparest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.jparest.entity.Movie;
import com.dxc.jparest.service.MovieService;

@RestController
@RequestMapping("/movieinfo")
public class MovieController {

	@Autowired
	MovieService movieService;

	// http://localhost:8572/movieinfo/all
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Movie> getAllMovie() {
		return this.movieService.getAllMovie();
	}

	// http://localhost:8572/movieinfo/addmovie
	@RequestMapping(value = "/addmovie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie addMovie(@RequestBody Movie movieinfo) {
		return this.movieService.addMovie(movieinfo);
	}

	// http://localhost:8572/movieinfo/updateMovie
	@RequestMapping(value = "/updateMovie", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movieinfo) {
		return this.movieService.updateMovie(movieinfo);
	}

	// http://localhost:8572/movieinfo/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Movie> getMovie(@PathVariable int id) {
		return this.movieService.getMovieById(id);
	}

	// http://localhost:8572/movieinfo/all
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	public void deleteAllMovies() {
		this.movieService.deleteAllMovies();
	}

	// http://localhost:8572/movieinfo/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable int id) {
		this.movieService.deleteMovieById(id);
	}
}
