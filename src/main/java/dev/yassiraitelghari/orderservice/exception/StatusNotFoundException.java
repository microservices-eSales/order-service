package dev.yassiraitelghari.orderservice.exception;

public class StatusNotFoundException extends RuntimeException{
    public StatusNotFoundException(String message){
        super(message);
    }
}
