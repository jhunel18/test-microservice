package com.example.microservicedepartment.repository;

import com.example.microservicedepartment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
