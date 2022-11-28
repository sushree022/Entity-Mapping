package com.assignment.entitymapping.controller;

import com.assignment.entitymapping.entity.Department;
import com.assignment.entitymapping.entity.Employee;
import com.assignment.entitymapping.service.DeptService;
import com.assignment.entitymapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "org/departmentDetails")
public class DepartmentController {
    @Autowired
    private DeptService deptService;
    public DepartmentController(DeptService deptService) {
        this.deptService = deptService;
    }

    @PostMapping(value = "/dept")
    public ResponseEntity<?> saveDeptDetails(@RequestBody Department department) {
        Department saveDept = deptService.saveDepartmentDetails(department);
        return new ResponseEntity<>(saveDept, HttpStatus.CREATED);
    }
    @GetMapping(value = "/dept")
    public ResponseEntity<?> getAllDepartmentNames(){
        return new ResponseEntity<List<Department>>(deptService.getListOfEmployeesOfTheDepartment(), HttpStatus.OK);
    }
}
