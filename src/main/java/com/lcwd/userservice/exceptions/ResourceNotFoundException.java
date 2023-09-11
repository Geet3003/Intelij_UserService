package com.lcwd.userservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource Not Found on sever!!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }

}
