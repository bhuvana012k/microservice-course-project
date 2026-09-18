package com.example.student_service.DTO;


import lombok.Data;

@Data
public class StudentResponse {
    private Integer StudentId;
    private String StudentName;
    private String email;
    private DepartmentDTO departmentDTO;
}
