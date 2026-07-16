package com.example.springweb.Exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(ResourceNotFoundException ex){

        Map<String, Object>  error = new HashMap<>();
        error.put("timestamp", LocalDateTime.now());
        error.put("message", ex.getMessage());
        // error.put("data", "data");
        error.put("status", 404);
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public  ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex){
                Map<String, String>  error = new HashMap<>();

                ex.getBindingResult().getFieldErrors().forEach( err -> {
                    error.put(err.getField() , err.getDefaultMessage());
                });

                return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    
}
