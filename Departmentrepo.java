package com.example.department_service.repo;

import com.example.department_service.model.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departmentrepo extends JpaRepository<department,Integer> {

}
