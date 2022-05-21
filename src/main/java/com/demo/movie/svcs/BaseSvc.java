package com.demo.movie.svcs;

import com.demo.movie.exceptions.BadRequestException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Lyheng
 * @date 20/5/22
 */
public class BaseSvc<T> {
    JpaRepository<T,Integer> repo;

    BaseSvc(JpaRepository r){
        this.repo=r;
    }
    public T create(T t) throws BadRequestException {
        return this.repo.save(t);
    }
    public List<T> findAll(){
        return this.repo.findAll();
    }

    public T findOne(Integer id){
        return this.repo.findById(id).orElse(null);
    }


    public T findOneWithException(Integer id) throws BadRequestException {
        T res = this.findOne(id);
        if (res!=null){
            return res;
        }
        throw new BadRequestException("Record ID is not valid");
    }

    public T delete(Integer id) throws BadRequestException {
         T res = this.findOne(id);
                if(res!=null){
                    this.repo.deleteById(id);
                    return res;
                }
                throw new BadRequestException("Record ID is not valid");
    }

}
