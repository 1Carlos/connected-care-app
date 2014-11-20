package com.fourthsource.cc.model.dao;

import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.CSVHeadEntity;

@Repository
public class CSVDetailDAOImpl implements CSVDetailDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id) {
		Set<CSVDetailEntity> list = ((CSVHeadEntity)sessionFactory.getCurrentSession().load(CSVHeadEntity.class, id)).getCsvDetailEntity();
		Hibernate.initialize(list);
		return list;
	}
	
	@Override
	public Integer saveCSVDetail(CSVDetailEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}

}
