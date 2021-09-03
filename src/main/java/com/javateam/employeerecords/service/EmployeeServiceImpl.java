package com.javateam.employeerecords.service;

import com.javateam.employeerecords.dao.EmployeeDao;
import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;
    public  EmployeeServiceImpl(EmployeeDao theEmployeeDao){
        employeeDao=theEmployeeDao;
    }
    @Override
    @Transactional
    public List<EmployeePersonalDetail> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public EmployeePersonalDetail findById(int theId) {
        return employeeDao.findById(theId);
    }
}
