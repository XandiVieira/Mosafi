package com.relyon.mosafi.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
public class RequestException {

    private final String message;
    //private Throwable throwable;
    private HttpStatus httpStatus;
    private ZonedDateTime timestamp;

    public RequestException(String message, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}