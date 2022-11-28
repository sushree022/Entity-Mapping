package com.assignment.entitymapping.repository;

import com.assignment.entitymapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
