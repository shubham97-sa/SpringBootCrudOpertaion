package com.javateam.employeerecords.dao;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoHibernateImpl  implements EmployeeDao{
    // define fields for entity manager

    private EntityManager entityManager;
    // define constructor injection

    @Autowired
    public  EmployeeDaoHibernateImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;

    }
    @Override

    public List<EmployeePersonalDetail> findAll() {
        // get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);

        //create query
        Query<EmployeePersonalDetail> theQuery= currentSession.createQuery("from EmployeePersonalDetail" ,EmployeePersonalDetail.class);

        //Execute query and get result list
        List<EmployeePersonalDetail> employees=theQuery.getResultList();

        return employees;
    }

    @Override
    public EmployeePersonalDetail findById(int theId) {
        // get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);
        // get the employee
        EmployeePersonalDetail theEmployee= currentSession.get(EmployeePersonalDetail.class,theId);
        // return the employee
        return theEmployee;
    }
}
