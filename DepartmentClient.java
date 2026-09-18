package com.example.student_service.feign;


import com.example.student_service.DTO.DepartmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("DEPARTMENT-SERVICE")
public interface DepartmentClient {
    @GetMapping("departments/{id}")
    public DepartmentDTO getDepartmentByID(@PathVariable Integer id);
}
