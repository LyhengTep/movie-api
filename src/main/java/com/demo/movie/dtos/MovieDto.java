package com.demo.movie.dtos;

import com.demo.movie.entities.Movie;

import javax.validation.constraints.*;

/**
 * @author Lyheng
 * @date 20/5/22
 */
public class MovieDto implements IDto<Movie>{
    @NotBlank(message = "Title is mandatory")
    private String title;

    @NotNull(message = "Rating is mandatory")
    @DecimalMin(value = "0.5",message = "Rating must be between 0.5 to 6")
    @DecimalMax(value = "6",message = "Rating must be between 0.5 to 6")
    private Float rating;
    @NotNull(message = "Category ID is mandatory")
    private Integer cat_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer catID) {
        this.cat_id = catID;
    }

    public Movie toEntity(){
        return new Movie(this.title,this.cat_id,this.rating);
    }
}
