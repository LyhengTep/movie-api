package com.demo.movie.svcs;

import com.demo.movie.entities.Category;
import com.demo.movie.repos.CategoryRepo;
import org.springframework.stereotype.Service;

/**
 * @author Lyheng
 * @date 20/5/22
 */
@Service
public class CategorySvc extends BaseSvc<Category> {
    CategorySvc(CategoryRepo r) {
        super(r);
    }
}
