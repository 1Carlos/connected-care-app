package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.domain.Icd10Entity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;

@Repository
public class Icd10ProgramsDAOImpl implements Icd10ProgramsDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Icd10ProgramsEntity getIcd10ProgramsById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10ProgramsEntity.class);
		criteria.add(Restrictions.eq("icd10ProgramsId", id));
		return (Icd10ProgramsEntity) criteria.uniqueResult();
	}
	
	@Override
	public Icd10ProgramsEntity getIcd10ProgramsByIcdCodeId(String icdCodeId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10ProgramsEntity.class);
		criteria.add(Restrictions.eq("icdCodeId", icdCodeId));
		return (Icd10ProgramsEntity) criteria.uniqueResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Icd10ProgramsEntity> getAllIcd10Programs() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity");
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		//q.setParameter("id", id);
		return q.list();
	}
	
	@Override
	public Integer saveIcd10(Icd10ProgramsEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}		
	
	@Override
	public void upDateIcd10(Icd10ProgramsEntity entity) {
		sessionFactory.getCurrentSession().update(entity);
	}		
}
