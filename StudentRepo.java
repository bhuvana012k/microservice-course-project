package com.example.student_service.repo;

import com.example.student_service.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<student,Integer> {

}
