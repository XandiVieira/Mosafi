package com.relyon.mosafi.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
public class RequestExceptionDetails {

    private final String message;
    private HttpStatus httpStatus;
    private ZonedDateTime timestamp;

    public RequestExceptionDetails(String message, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}