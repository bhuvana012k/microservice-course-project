package com.example.department_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer departmentId;
    private String departmentName;
    private String HOD;
    private String location;
    private boolean isNbaAccredited;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHOD() {
        return HOD;
    }

    public void setHOD(String HOD) {
        this.HOD = HOD;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isNbaAccredited() {
        return isNbaAccredited;
    }

    public void setIsNbaAccredited(boolean isnbaAccredited) {
        isNbaAccredited = isnbaAccredited;
    }
    public department(Integer departmentId, String departmentName, String HOD, String location, boolean isNbaAccredited) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.HOD = HOD;
        this.location = location;
        this.isNbaAccredited = isNbaAccredited;
    }

    public department() {
    }
}
