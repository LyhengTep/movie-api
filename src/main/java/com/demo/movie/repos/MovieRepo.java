package com.demo.movie.repos;

import com.demo.movie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lyheng
 * @date 19/5/22
 */
public interface MovieRepo extends JpaRepository<Movie,Integer> {
}
