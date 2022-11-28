package com.assignment.entitymapping.service;

import com.assignment.entitymapping.entity.Employee;

import java.util.List;

public interface EmpService {
    public Employee saveEmployeeDetails(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
}
