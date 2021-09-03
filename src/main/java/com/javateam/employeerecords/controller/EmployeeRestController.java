package com.javateam.employeerecords.controller;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import com.javateam.employeerecords.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    EmployeeService employeeService;

//    @DeleteMapping("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId){
//        EmployeePersonalDetail tempEmployeePersonalDetail = EmployeeService.findbyId(employeeId);
//        if(tempEmployeePersonalDetail==null){
//            throw new RuntimeException("Employee id not found =" + employeeId);
//        }
//        EmployeeService.deleteById(employeeId);
//        return "Deleted "+employeeId;
//    }
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
