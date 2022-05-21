package com.demo.movie.svcs;

import com.demo.movie.entities.Category;
import com.demo.movie.entities.Movie;
import com.demo.movie.exceptions.BadRequestException;
import com.demo.movie.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lyheng
 * @date 19/5/22
 */
@Service
public class MovieSvc extends BaseSvc<Movie>{
    @Autowired
    CategorySvc catSvc;
    public MovieSvc(MovieRepo repo){
        super(repo);
    }
    public Movie create(Movie mv) throws BadRequestException {
        Category mvExist = this.catSvc.findOne(mv.getCat_id());
        if(mvExist!=null){
            return super.create(mv);
        }
       throw new BadRequestException("Category is not valid");
    }
    public Movie update(Movie mv) throws BadRequestException {
        if(mv.getId()!=null){
            Movie mvDb= this.findOne(mv.getId());
            if(mvDb!=null){
                return this.create(mv);
            }
            return null;
        }
        return null;
    }
}
