package dev.yassiraitelghari.orderservice.exception;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(String string){
        super(string);
    }
}
