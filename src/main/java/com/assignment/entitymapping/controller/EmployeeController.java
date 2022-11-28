package com.assignment.entitymapping.controller;

import com.assignment.entitymapping.entity.Employee;
import com.assignment.entitymapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "org/empDetails")
public class EmployeeController {
    @Autowired
    private EmpService empService;

    public EmployeeController(EmpService empService) {
        this.empService = empService;
    }
    @PostMapping("/emp")
    public ResponseEntity<?> saveEmpDetails(@RequestBody Employee employee){
        Employee saveEmployee = empService.saveEmployeeDetails(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/emp")
    public ResponseEntity<?> getAllEmployees(){
        return new ResponseEntity<List<Employee>>(empService.getAllEmployees(), HttpStatus.OK);
    }
    @GetMapping("/emp/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){
        Employee empDetails = empService.getEmployeeById(id);
        return new ResponseEntity<>(empDetails,HttpStatus.OK);
    }
}
