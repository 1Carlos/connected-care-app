package com.fourthsource.cc.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CasesViewEntity;

@Repository
public class CasesViewDAOImpl implements CasesViewDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<CasesViewEntity> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(CasesViewEntity.class).list();
	}
	
}
