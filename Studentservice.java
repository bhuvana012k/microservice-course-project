package com.example.student_service.service;

import com.example.student_service.DTO.DepartmentDTO;
import com.example.student_service.DTO.StudentResponse;
import com.example.student_service.exception.StudentNotFound;
import com.example.student_service.feign.DepartmentClient;
import com.example.student_service.model.student;
import com.example.student_service.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {

    @Autowired
     private StudentRepo repo;
    @Autowired
    private DepartmentClient departmentClient;
    public List<student>getallStudent() {
        return repo.findAll();
    }

    public student addStudent(student student) {
        Integer deptId=student.getDepartmentId();
        departmentClient.getDepartmentByID(deptId);
        return repo.save(student);
    }

    public student getStudentByid(Integer id) {
        Optional<student> student= repo.findById(id);
        if(student.isEmpty()){
            throw new StudentNotFound("Student Not found with ID -"+id);
        }
        return student.get();
    }

    public StudentResponse getStudentsDetails(Integer id) {
        student student=getStudentByid(id);
        StudentResponse response=new StudentResponse();
        response.setStudentId(id);
        response.setStudentName(student.getName());
        response.setEmail(student.getEmail());

        Integer deptId= student.getDepartmentId();

        DepartmentDTO departmentDTO=
                departmentClient.getDepartmentByID(deptId);
        response.setDepartmentDTO(departmentDTO);
        return response;
    }
}
