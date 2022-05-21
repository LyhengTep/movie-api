package com.demo.movie.controllers;

import com.demo.movie.dtos.CategoryDto;
import com.demo.movie.dtos.MovieDto;
import com.demo.movie.entities.Category;
import com.demo.movie.exceptions.BadRequestException;
import com.demo.movie.svcs.CategorySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Lyheng
 * @date 20/5/22
 */
@RequestMapping("/api/category")
public class CategoryController  {
   @Autowired
   CategorySvc svc;

    @PostMapping
    public Category createMovie(@RequestBody CategoryDto body) throws BadRequestException {
        return this.svc.create(body.toEntity());
    }

    @GetMapping
    public List<Category> findAll(){
        return this.svc.findAll();
    }
}
