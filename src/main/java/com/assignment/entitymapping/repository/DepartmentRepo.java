package com.assignment.entitymapping.repository;

import com.assignment.entitymapping.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
