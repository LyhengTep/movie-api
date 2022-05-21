package com.demo.movie.controllers;

import com.demo.movie.dtos.CategoryDto;
import com.demo.movie.dtos.MovieDto;
import com.demo.movie.entities.Category;
import com.demo.movie.exceptions.BadRequestException;
import com.demo.movie.svcs.CategorySvc;
import com.demo.movie.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lyheng
 * @date 20/5/22
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController  {
   @Autowired
   CategorySvc svc;

    @PostMapping
    public Response<Category> createMovie(@RequestBody CategoryDto body) throws BadRequestException {
        Category cat = this.svc.create(body.toEntity());
        return new Response<Category>(true,cat,"Success");
    }

    @GetMapping
    public Response<List<Category>> findAll(){
        List<Category> listCat= this.svc.findAll();
        return new Response<List<Category>>(true,listCat,"Success");
    }
}
