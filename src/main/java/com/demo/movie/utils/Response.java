package com.demo.movie.utils;

/**
 * @author Lyheng
 * @date 21/5/22
 */
public class Response<T> {
    private boolean success;
    private String message;
    private T data;
    private T errors;
    public Response(boolean success,T data,String msg){
        this.success=success;
        this.data= data;
        this.message=msg;
    }

    public Response(boolean success,T data,String msg,T errors){
        this.success=success;
        this.data= data;
        this.message=msg;
        this.errors=errors;
    }

    public T getErrors() {
        return errors;
    }

    public void setErrors(T errors) {
        this.errors = errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
