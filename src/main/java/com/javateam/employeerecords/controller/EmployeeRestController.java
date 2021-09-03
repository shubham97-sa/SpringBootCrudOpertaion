package com.javateam.employeerecords.controller;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import com.javateam.employeerecords.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class EmployeeRestController {
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        EmployeePersonalDetail tempEmployeePersonalDetail = EmployeeService.findbyId(employeeId);
        if(tempEmployeePersonalDetail==null){
            throw new RuntimeException("Employee id not found =" + employeeId);
        }
        EmployeeService.deleteById(employeeId);
        return "Deleted "+employeeId;
    }
}
