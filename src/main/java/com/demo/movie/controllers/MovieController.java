package com.demo.movie.controllers;


import com.demo.movie.dtos.MovieDto;
import com.demo.movie.dtos.UpdateMovieDto;
import com.demo.movie.entities.Movie;
import com.demo.movie.exceptions.BadRequestException;
import com.demo.movie.svcs.MovieSvc;
import com.demo.movie.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * @author Lyheng
 * @date 19/5/22
 */
@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    MovieSvc svc;

    /**
     * Create movie by accepting MovieDto as a body request
     * @param body MovieDto
     * @return Response<Movie> (success, movie, message)
     */
    @PostMapping
    public Response<Movie> createMovie(@Valid @RequestBody MovieDto body) throws BadRequestException {
        Movie mv = this.svc.create(body.toEntity());

        return new Response<Movie>(true,mv,"Success");
    }

    /**
     * List all the movie
     * @return List of the movies
     */
    @GetMapping
    public Response<List<Movie>> findAll(){
        List<Movie> lsMovie= this.svc.findAll();
        return new Response<List<Movie>>(true,lsMovie,"Success");
    }

    /**
     * Get a movie by its ID
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Response<Movie> findOne(@PathVariable("id") Integer id) throws BadRequestException {
        Movie mv =  this.svc.findOneWithException(id);
        return new Response<Movie>(true,mv,"Success");
    }

    /**
     * Update the movie by passing the ID in body to update
     * @param mvDto UpdateMovieDto
     * @return
     */
    @PutMapping
    public Response<Movie> update(@RequestBody UpdateMovieDto mvDto) throws BadRequestException {
        Movie mv =  this.svc.update(mvDto.toEntity());
        return new Response<Movie>(true,mv,"Success");
    }

    /**
     * Delete record by ID
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public Response<Movie> delete(@PathVariable("id") Integer id) throws BadRequestException {
        Movie mv =  this.svc.delete(id);
        return new Response<Movie>(true,mv,"Success");
    }

}
