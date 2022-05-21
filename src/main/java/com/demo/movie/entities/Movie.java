package com.demo.movie.entities;

import javax.persistence.*;

/**
 * @author Lyheng
 * @date 20/5/22
 */
@Entity(name="movie") // This tells Hibernate to make a table out of this class
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String title;

    @Column(name = "cat_id",nullable=false)
    private Integer cat_id;

    @Column(
            name = "rating",
            nullable = true,
            columnDefinition = "float default 0.5"
    )
    private Float rating;

    public Integer getId() {
        return id;
    }
    public Movie(String t,Integer cat,Float r ){
        this.title=t;
        this.cat_id=cat;
        this.rating=r;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  Movie(){}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}