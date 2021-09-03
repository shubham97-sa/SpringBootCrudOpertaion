package com.javateam.employeerecords.service;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<EmployeePersonalDetail> findAll();
    EmployeePersonalDetail findById(int theId);
    public void deleteById (int theId);
}
