package com.example.student_service.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class StudentNotFound extends RuntimeException{
    public StudentNotFound(String message) {
        super(message);
    }
}
