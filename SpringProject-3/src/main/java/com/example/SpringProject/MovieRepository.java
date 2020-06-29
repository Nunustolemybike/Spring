package com.example.SpringProject;
import java.util.Collection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
@RepositoryRestResource(path="movie")
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    Movie findByfilmtitre(String film_titre);
}
 	