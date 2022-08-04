package com.relyon.mosafi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException e) {
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        RequestExceptionDetails requestExceptionDetails = new RequestExceptionDetails(e.getMessage(),
                notFound,
                ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(requestExceptionDetails, notFound);
    }

    @ExceptionHandler(value = {AlreadyExistsException.class})
    public ResponseEntity<Object> handleAlreadyExistsException(AlreadyExistsException ex) {
        HttpStatus notFound = HttpStatus.CONFLICT;
        RequestExceptionDetails requestExceptionDetails = new RequestExceptionDetails(ex.getMessage(),
                notFound,
                ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(requestExceptionDetails, notFound);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globleExcpetionHandler(Exception ex) {
        HttpStatus internalServerError = HttpStatus.INTERNAL_SERVER_ERROR;
        RequestExceptionDetails requestExceptionDetails = new RequestExceptionDetails(ex.getMessage(),
                internalServerError,
                ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(requestExceptionDetails, internalServerError);
    }
}