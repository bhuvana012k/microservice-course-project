package com.example.department_service.controller;

import com.example.department_service.model.department;
import com.example.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departments")
public class DepartmentController {
    @Autowired
    DepartmentService service;
    @GetMapping
    public ResponseEntity<List<department>> getalldepartments(){
        return new ResponseEntity<>(service.getalldepartments(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public department getDepartmentByID(@PathVariable Integer id){

        return service.getDepartmentByID(id);
    }
    @PostMapping
    public ResponseEntity<department> AddDepartment(@RequestBody department department){
        return new ResponseEntity<>(service.AddDepartment(department),HttpStatus.CREATED);
    }
    @PutMapping
    public department UpdateDepartment(@RequestBody department department){
        return service.UpdateDepartment(department);
    }
    @DeleteMapping("/{id}")
    public String DeleteDepartment(@PathVariable Integer id){
        return service.DeleteDepartment(id);

    }
}
