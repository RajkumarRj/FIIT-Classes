package com.example.validatorspringjpa;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String>  handleMethodNotValidException(MethodArgumentNotValidException ex){
        
        Map<String, String> hp = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach( err ->{

            String fieldname = ((FieldError) err).getField();
            String message = err.getDefaultMessage();

            hp.put(fieldname, message);
        });

        return hp;
    }
}
