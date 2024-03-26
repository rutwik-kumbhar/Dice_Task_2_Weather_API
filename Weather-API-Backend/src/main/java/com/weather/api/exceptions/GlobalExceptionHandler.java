package com.weather.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<ExceptionFormat> resourceNotFoundExceptionHandler(InvalidRequestException ex , WebRequest request){
        return new ResponseEntity<ExceptionFormat>(new ExceptionFormat(LocalDateTime.now(),ex.getMessage(),request.getDescription(false)), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ExceptionFormat> handlerNotFoundException(NoHandlerFoundException ex ,WebRequest request){
        ExceptionFormat ef = new ExceptionFormat(LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<ExceptionFormat>(ef,HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionFormat> globalException(Exception ex , WebRequest request){
        return new ResponseEntity<ExceptionFormat>(new ExceptionFormat(LocalDateTime.now(),ex.getMessage(),request.getDescription(false)),HttpStatus.BAD_REQUEST);
    }



}
