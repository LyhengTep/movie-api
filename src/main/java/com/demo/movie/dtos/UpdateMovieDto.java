package com.demo.movie.dtos;

import com.demo.movie.entities.Movie;

import javax.validation.constraints.NotNull;

/**
 * @author Lyheng
 * @date 20/5/22
 */
public class UpdateMovieDto extends MovieDto {
    @NotNull(message = "ID is mandatory")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Movie toEntity() {
        Movie mv = super.toEntity();
        mv.setId(id);
        return mv;
    }
}
