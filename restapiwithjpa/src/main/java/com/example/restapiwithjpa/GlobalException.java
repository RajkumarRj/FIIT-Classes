package com.example.restapiwithjpa;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        
        Map<String, String> errorMap = new HashMap<>();


        ex.getBindingResult().getAllErrors().forEach(error->{
            String filedname = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errorMap.put(filedname, message);

        });

        return errorMap;
        
    }
    
}
