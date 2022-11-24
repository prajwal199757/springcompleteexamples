package com.example.demo.exceptionhandler;

import com.example.demo.exceptions.NoEmployeesException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {
    @ExceptionHandler(NoEmployeesException.class)
    public ResponseEntity<Object> handleNonExistingEmp(NoEmployeesException exception) {
        return new ResponseEntity<>("Employees not found", HttpStatus.BAD_GATEWAY);
    }
}
