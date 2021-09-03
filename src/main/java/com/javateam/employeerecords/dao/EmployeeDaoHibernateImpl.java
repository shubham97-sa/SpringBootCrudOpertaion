package com.javateam.employeerecords.dao;

import com.javateam.employeerecords.entity.EmployeePersonalDetail;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoHibernateImpl implements  EmployeeDao{


    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<EmployeePersonalDetail> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<EmployeePersonalDetail> theQuery = currentSession.createQuery("From EmployeePersonalDetail",EmployeePersonalDetail.class );

        List<EmployeePersonalDetail> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public void save(EmployeePersonalDetail employeePersonalDetail) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(employeePersonalDetail);

    }
}
