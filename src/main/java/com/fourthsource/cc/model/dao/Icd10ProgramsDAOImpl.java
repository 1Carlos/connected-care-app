package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.controller.services.Icd10ProgramsService;
import com.fourthsource.cc.domain.Icd10Entity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;

@SuppressWarnings("unused")
@Repository
public class Icd10ProgramsDAOImpl implements Icd10ProgramsDAO  {
	
	private final static Logger logger = LoggerFactory.getLogger(Icd10ProgramsDAOImpl.class);
	
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
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity ORDER by icdCodeId.icdCode");
		Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity ORDER BY icdCodeId.icdCode"); //used with Carlos
		//q.setParameter("id", id);
		return q.list();
	}
	
	@Override
	public Integer saveIcd10(Icd10ProgramsEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}		

	@Override
	public Boolean existIcd10Programs(String id) throws HibernateException{
		//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10ProgramsEntity.class);
		//criteria.add(Restrictions.eq("icdCodeId", id));
		Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity WHERE icdCodeId.icdCodeId = :id"); //used with Carlos
		q.setParameter("id", id);
        
		if ( q.list().size() == 0 ){ //List.isEmpty? TRUE|=>FALSE , FALSE|=>TRUE
			return false;
		}else{
			return true;
		}
	}	
	
	@Override
	public void updateIcd10(Icd10ProgramsEntity entity) {
		sessionFactory.getCurrentSession().update(entity);
	}		
	
	@Override
	public void deleteIcd10(Icd10ProgramsEntity entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	/*  @Override  */
	public void upDateIcd10(Icd10ProgramsEntity entity) {
		// TODO Auto-generated method stub
		
	}		
}

