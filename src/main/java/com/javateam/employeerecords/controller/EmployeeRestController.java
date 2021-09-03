package com.javateam.employeerecords.controller;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import com.javateam.employeerecords.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
   // private EmployeeService employeeService;

    @Autowired
    EmployeeService employeeService;
    /*public  EmployeeRestController(){
        employeeService=theEmployeeService;
    }*/

    @GetMapping("/employees")
    public List<EmployeePersonalDetail> findALL(){
        return employeeService.findAll();

    }

    // add maping to get /employees/employeeId
    @GetMapping("/employees/{employeeId}")
    public EmployeePersonalDetail getEmployee(@PathVariable int employeeId){
        EmployeePersonalDetail theEmployee= employeeService.findById(employeeId);

        if(theEmployee==null){
            throw  new RuntimeException("Employee not found  at " + employeeId);

        }
        return  theEmployee;
    }
}
