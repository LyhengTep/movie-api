package com.demo.movie.dtos;

import com.demo.movie.entities.Category;

/**
 * @author Lyheng
 * @date 20/5/22
 */
public class CategoryDto implements IDto{
    private String name;
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public Category toEntity() {
        return new Category(name,des);
    }
}
