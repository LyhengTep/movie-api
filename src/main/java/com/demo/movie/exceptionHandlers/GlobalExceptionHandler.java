package com.demo.movie.exceptionHandlers;

import com.demo.movie.exceptions.BadRequestException;
import com.demo.movie.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lyheng
 * @date 21/5/22
 */

@RestControllerAdvice()
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    Response handleBadReq(HttpServletResponse response, BadRequestException ex){
        return new Response(false,null,ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    Response<Map<String, String>> handleValidationExceptions(HttpServletResponse response, MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new Response<Map<String, String>>(false,null,"Validations failed",errors);
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    Response internalServerErrHandler(HttpServletResponse response, Exception ex){
        return  new Response(false,null,ex.getMessage());
    }

}
