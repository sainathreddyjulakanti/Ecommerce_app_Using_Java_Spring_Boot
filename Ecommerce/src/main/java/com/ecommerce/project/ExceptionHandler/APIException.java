package com.ecommerce.project.ExceptionHandler;

public class APIException extends RuntimeException{
    private static  final long serialUID=1l;
    public APIException(){
    }

    public APIException(String message) {
        super(message);
    }
}
