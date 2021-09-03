package com.javateam.employeerecords.service;

import com.javateam.employeerecords.dao.EmployeeDao;
import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public List<EmployeePersonalDetail> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public void save(EmployeePersonalDetail employeePersonalDetail) {
        employeeDao.save(employeePersonalDetail);

    }
}
