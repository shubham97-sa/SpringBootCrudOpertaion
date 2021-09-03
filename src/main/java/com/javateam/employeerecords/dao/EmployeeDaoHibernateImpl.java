package com.javateam.employeerecords.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class EmployeeDaoHibernateImpl  implements EmployeeDao{
    private EntityManager entityManager;
    @Autowired
    public EmployeeDaoHibernateImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery =  currentSession.createQuery("delete from EmployeePersonalDetails where id =:employeeId");
        theQuery.setParameter("employeeId", theId);
        theQuery.executeUpdate();
    }
}
