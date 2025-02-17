package dev.yassiraitelghari.orderservice.exception;

public class DeliveryNotFoundException extends RuntimeException{
    public DeliveryNotFoundException(String message){
        super(message);
    }
}
