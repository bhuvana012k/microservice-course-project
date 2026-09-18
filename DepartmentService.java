package com.example.department_service.service;

import com.example.department_service.exception.DepartmentNotFoundException;
import com.example.department_service.model.department;
import com.example.department_service.repo.Departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    Departmentrepo repo;
    public List<department> getalldepartments() {
        return repo.findAll();

    }

    public department getDepartmentByID(Integer id) {
        Optional<department> dept=repo.findById(id);
        if(dept.isEmpty()){
            throw new DepartmentNotFoundException("Department not found with ID "+id);
        }
        return dept.get();
    }

    public department AddDepartment(department department) {
        return repo.save(department);
    }

    public department UpdateDepartment(department department) {
        return repo.save(department);
    }

    public String DeleteDepartment(Integer id) {
        repo.deleteById(id);
        return "Department deleted successfully";
    }
}
