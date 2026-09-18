package com.example.department_service.exception;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
