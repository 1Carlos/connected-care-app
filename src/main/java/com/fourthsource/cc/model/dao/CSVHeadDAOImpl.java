package com.fourthsource.cc.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CSVHeadEntity;

@Repository
public class CSVHeadDAOImpl implements CSVHeadDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public CSVHeadEntity getCSVHead(Integer id) {
		return (CSVHeadEntity)sessionFactory.getCurrentSession().get(CSVHeadEntity.class, id);
	}
	
	@Override
	public Integer saveCSVHead(CSVHeadEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}

}
