package com.fourthsource.cc.model.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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
	
	@Override
	@SuppressWarnings("unchecked")
	public List<CasesViewEntity> getAllOpenCases() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CasesViewEntity.class);
		criteria.add(Restrictions.eq("caseStatus", 1));
		return criteria.list();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<CasesViewEntity> getAllByExpresion(List<Criterion> expressions) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CasesViewEntity.class);
		
		for(Criterion expression : expressions) {
			criteria.add(expression);
		}
		
		return criteria.list();
	}
	
}
