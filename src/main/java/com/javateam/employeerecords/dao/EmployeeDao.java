package com.javateam.employeerecords.dao;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;

import java.util.List;

public interface EmployeeDao {
    public List<EmployeePersonalDetail> findAll();

    public void save(EmployeePersonalDetail employeePersonalDetail);

}
