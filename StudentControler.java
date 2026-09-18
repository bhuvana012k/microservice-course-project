package com.example.student_service.controller;

import com.example.student_service.DTO.StudentResponse;
import com.example.student_service.model.student;
import com.example.student_service.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentControler {
    @Autowired
    private Studentservice studentservice;
    @GetMapping
    public ResponseEntity<List<student>> getallStudent(){
        return new ResponseEntity<>(studentservice.getallStudent(), HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<student> getStudentById(@PathVariable Integer id){
        return new ResponseEntity<>(studentservice.getStudentByid(id),HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<student> addStudents(@RequestBody student student){
        return new ResponseEntity<>(studentservice.addStudent(student),HttpStatus.CREATED);
    }
    @GetMapping("/details/{id}")
    public ResponseEntity<StudentResponse> getStudentsDetails(
            @PathVariable Integer id
    ){
        return new ResponseEntity<>(
                studentservice.getStudentsDetails(id),HttpStatus.OK
        );
    }


}
