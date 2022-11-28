package com.assignment.entitymapping.service;

import com.assignment.entitymapping.entity.Department;
import com.assignment.entitymapping.entity.Employee;
import com.assignment.entitymapping.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DeptService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentServiceImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public Department saveDepartmentDetails(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getListOfEmployeesOfTheDepartment() {

        return departmentRepo.findAll();
    }

}
