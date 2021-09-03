package com.javateam.employeerecords.service;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;

import java.util.List;

public interface EmployeeService {

    public List<EmployeePersonalDetail> findAll();
    public void save(EmployeePersonalDetail employeePersonalDetail);
}
