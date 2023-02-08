package com.example.microservicedepartment.service;

import com.example.microservicedepartment.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
