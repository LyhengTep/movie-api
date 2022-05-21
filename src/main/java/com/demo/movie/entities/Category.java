package com.demo.movie.entities;

import javax.persistence.*;

/**
 * @author Lyheng
 * @date 20/5/22
 */
@Entity(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "name",nullable=false)
    private String name;

    private String des;


    public Category(){}

    public Category(String name, String des){
        this.name=name;
        this.des=des;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
