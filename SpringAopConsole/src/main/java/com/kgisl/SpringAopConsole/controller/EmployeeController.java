package com.kgisl.SpringAopConsole.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.SpringAopConsole.exception.ResourceNotFoundException;
import com.kgisl.SpringAopConsole.model.Employee;
import com.kgisl.SpringAopConsole.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService eService;
    @GetMapping("/emp")
    public List<Employee> getAllEmployees(){
        return eService.getAllEmployees();

    }

    @GetMapping("/emp/{id}")
    public ResponseEntity < Employee > getEmployeeById(@PathVariable(value = "id") Long employeeId)
    throws ResourceNotFoundException {
        Employee employee = eService.getEmployeeById(employeeId)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }
    
    @PostMapping("/create")
    public Employee createEmployee(@Validated @RequestBody Employee emp){
        return eService.createEmployee(emp);
    }

    @PutMapping("/emp/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long employeeId,@Validated @RequestBody Employee EmpDetails) throws ResourceNotFoundException{
        Employee updateEmployee=eService.updateEmployee(employeeId,EmpDetails);
        return ResponseEntity.ok(updateEmployee);
    }


    @DeleteMapping("emp/{id}")
    public Map<String,Boolean> deleteEmployee(@PathVariable(value="id") Long employeeId) throws ResourceNotFoundException{
        return eService.deleteEmployee(employeeId);
    }
}
