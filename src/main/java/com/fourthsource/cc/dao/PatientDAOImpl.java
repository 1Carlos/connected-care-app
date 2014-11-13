package com.fourthsource.cc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.PatientEntity;

@Repository
public class PatientDAOImpl implements PatientDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<PatientEntity> getAllPatients() {
		return sessionFactory.getCurrentSession().createCriteria(PatientEntity.class).list();
	}

}
