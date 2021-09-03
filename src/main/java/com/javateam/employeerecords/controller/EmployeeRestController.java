package com.javateam.employeerecords.controller;

import com.javateam.employeerecords.dao.EmployeeDao;
import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import com.javateam.employeerecords.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //private EmployeeDao employeeDao;
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService= employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeePersonalDetail> findAll(){
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public EmployeePersonalDetail addPersonalDetail(@RequestBody EmployeePersonalDetail employeePersonalDetail){

        //employeePersonalDetail.setEmployeeId(0);
        employeeService.save(employeePersonalDetail);

        return employeePersonalDetail;
    };
}
