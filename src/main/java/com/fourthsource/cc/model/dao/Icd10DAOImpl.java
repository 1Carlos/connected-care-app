package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.Icd10Entity;

@Repository
public class Icd10DAOImpl implements Icd10DAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Icd10Entity getIcd10ById(String id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10Entity.class);
		criteria.add(Restrictions.eq("icdCodeId", id));
		return (Icd10Entity) criteria.uniqueResult();
	}
	
	@Override
	public Icd10Entity getIcd10ByIcdCode(String icdCode) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10Entity.class);
		criteria.add(Restrictions.eq("icdCode", icdCode));
		return (Icd10Entity) criteria.uniqueResult();
	}
	
	@Override
	public Integer save(Icd10Entity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}	
}
