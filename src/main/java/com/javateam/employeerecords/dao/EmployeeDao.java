package com.javateam.employeerecords.dao;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;

import java.util.List;

public interface EmployeeDao {
    List<EmployeePersonalDetail> findAll();
    EmployeePersonalDetail findById(int theId);
}
