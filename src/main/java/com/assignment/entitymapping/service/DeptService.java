package com.assignment.entitymapping.service;

import com.assignment.entitymapping.entity.Department;
import com.assignment.entitymapping.entity.Employee;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface DeptService {
    public Department saveDepartmentDetails(Department department);
    public List<Department> getListOfEmployeesOfTheDepartment();

}
