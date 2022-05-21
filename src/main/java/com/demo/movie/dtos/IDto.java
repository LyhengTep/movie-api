package com.demo.movie.dtos;

/**
 * @author Lyheng
 * @date 20/5/22
 */
public interface IDto<T> {
   public T toEntity();
}
