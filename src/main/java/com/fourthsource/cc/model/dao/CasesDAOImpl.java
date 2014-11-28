package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CaseEntity;

@Repository
public class CasesDAOImpl implements CasesDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public CaseEntity getCaseById(int id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CaseEntity.class);
		criteria.add(Restrictions.eq("id", id));
		return (CaseEntity) criteria.uniqueResult();
	}
	
}
