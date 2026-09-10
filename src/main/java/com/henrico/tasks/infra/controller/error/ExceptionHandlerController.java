package com.henrico.tasks.infra.controller.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.henrico.tasks.application.service.exception.UserRegisteredException;
import com.henrico.tasks.domain.exception.InvalidPasswordException;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ErrorResponse> handleInvalidPassword(InvalidPasswordException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "Bad Request", exception.getMessage());
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(UserRegisteredException.class)
    public ResponseEntity<ErrorResponse> handleInvalidPassword(UserRegisteredException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "Bad Request", exception.getMessage());
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
