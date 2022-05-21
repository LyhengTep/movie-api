package com.demo.movie.exceptions;


/**
 * @author Lyheng
 * @date 21/5/22
 */

public class BadRequestException extends  Exception{
    public BadRequestException(String msg){
        super(msg);
    }
}
