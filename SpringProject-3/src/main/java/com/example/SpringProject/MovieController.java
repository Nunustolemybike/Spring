package com.example.SpringProject;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	private final MovieRepository repository;
	MovieController(MovieRepository repository){
		this.repository=repository;
	}

	  @GetMapping("/movies")
	  Iterable<Movie> all() {
	    return repository.findAll();
	  }
	  @PostMapping("/movies")
	  Movie newmovie(@RequestBody Movie newmovie) {
	    return repository.save(newmovie);
	  }
	   
	  @GetMapping("/movies/{id}")
	  Movie one(@PathVariable Integer id) {
	      return repository.findById(id)
	        .orElseThrow();
	    }

	    @DeleteMapping("/movies/{id}")
	    void deleteMovie(@PathVariable Integer id) {
	      repository.deleteById(id);
	    }
	  }


