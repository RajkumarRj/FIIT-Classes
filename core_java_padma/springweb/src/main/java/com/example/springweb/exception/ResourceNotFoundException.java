package com.example.springweb.exception;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message); // calls parent constructor 
    }
    
}
