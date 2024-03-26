package com.weather.api.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class FeignErrorDecoder implements ErrorDecoder {


    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == HttpStatus.NOT_FOUND.value()) {
            return new InvalidRequestException("Invalid Request");
        } else if (response.status() == HttpStatus.BAD_REQUEST.value()) {
            return new BadRequestException("Bad Request");
        }
        return new HttpClientErrorException(HttpStatus.valueOf(response.status()));
    }

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<ExceptionFormat> resourceNotFoundExceptionHandler(InvalidRequestException ex , WebRequest request){
        return new ResponseEntity<ExceptionFormat>(new ExceptionFormat(LocalDateTime.now(),ex.getMessage(),request.getDescription(false)), HttpStatus.NOT_FOUND);
    }



    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionFormat> handleBadRequestException(BadRequestException ex, WebRequest request) {
        return new ResponseEntity<ExceptionFormat>(new ExceptionFormat(LocalDateTime.now(),ex.getMessage(),request.getDescription(false)), HttpStatus.NOT_FOUND);
    }
}
