package com.training.userapplication.exceptionhandler;

import com.training.userapplication.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object> handleNonExistingUser(UserNotFoundException exception) {
        return new ResponseEntity<>("User not found", HttpStatus.BAD_GATEWAY);
    }


}
